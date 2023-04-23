package com.github.huluvu424242.sql.ddl;

/*-
 * #%L
 * java-compiler-template
 * %%
 * Copyright (C) 2023 Huluvu424242
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqlDDL2PlantumlCompilerTest {

    public static final File sourceFolder = new File("src/test/ddlfiles");
    public static final File targetFolder = new File("target/test-output-files");

    @BeforeAll
    static void setUp() {
        leereTargetFolder();
        targetFolder.mkdirs();
    }

    static void leereTargetFolder() {
        if (!targetFolder.exists()) return;
        final File[] targetFiles = targetFolder.listFiles();
        if (targetFiles == null) return;

        final List<File> erroredFiles = Arrays.stream(targetFiles).filter((File file) -> !file.delete()).toList();
        if (!erroredFiles.isEmpty()) {
            throw new RuntimeException(erroredFiles.toString());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"simpleCreateTable"})
    void checkCreateTableSyntax(final String fileName) throws IOException {
        final File sourceDDLFile = new File(sourceFolder, fileName + ".sql");
        final File targetFile = new File(targetFolder, fileName + ".plantuml");
        final SqlDDL2PlantumlCompiler compiler = SqlDDL2PlantumlCompiler
                .builder()
                .sourceDDLFile(sourceDDLFile)
                .targetPlantumlFile(targetFile)
                .build();
        compiler.run();

        final File sourceResultFile = new File(sourceFolder, fileName + ".plantuml");
        final String expectationContent = Files.readString(sourceResultFile.toPath());
        final String realContent = Files.readString(targetFile.toPath());
        assertEquals(expectationContent, realContent);

    }

}
