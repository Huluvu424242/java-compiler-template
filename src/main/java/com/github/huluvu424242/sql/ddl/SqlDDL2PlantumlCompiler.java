package com.github.huluvu424242.sql.ddl;

import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLLexer;
import com.github.huluvu424242.sql.ddl.antlr4.SqlDDLParser;
import lombok.Builder;
import lombok.SneakyThrows;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileReader;

/*-
 * #%L
 * java-compiler-template
 * %%
 * Copyright (C) 2023 PIUG
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

/**
 * Hauptklasse für die Übersetzung einer DDL Datei in eine plantuml Datei.
 * Das Builder Pattern wurder verwendet, da der Compilationsprozess von antlr nicht
 * Threadsafe ist und somit sichergestellt wird, dass für jedes zu übersetzende
 * File eine nue Instanz benutzt wird.
 */
@Builder
public class SqlDDL2PlantumlCompiler implements Runnable {

    protected final File sourceDDLFile;
    protected final File targetPlantumlFile;


    @SneakyThrows
    @Override
    public void run() {
        if (targetPlantumlFile.exists()) {
            targetPlantumlFile.delete();
        }
        targetPlantumlFile.createNewFile();

        checkPreConditions();
        // create compiler skeleton
        final SqlDDLLexer markupLexer = new SqlDDLLexer(CharStreams.fromReader(new FileReader(sourceDDLFile)));
        final CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        final SqlDDLParser markupParser = new SqlDDLParser(commonTokenStream);
        SqlDDLParser.ParseContext fileContext = markupParser.parse();
        final DDLScriptVisitor visitor = new DDLScriptVisitor();
        visitor.visit(fileContext);
    }

    protected void checkPreConditions() throws SqlDDL2PlantumlCompilerException {
        if (sourceDDLFile == null) {
            throw new SqlDDL2PlantumlCompilerException("source file does not exists.");
        } else if (!sourceDDLFile.exists()) {
            throw new SqlDDL2PlantumlCompilerException(String.format("source file does not exists: %s", sourceDDLFile.getAbsolutePath()));
        } else if (!targetPlantumlFile.canWrite()) {
            throw new SqlDDL2PlantumlCompilerException(String.format("target file not writeable: %s", targetPlantumlFile.getAbsolutePath()));
        }
    }


}

class SqlDDL2PlantumlCompilerException extends Exception {

    public SqlDDL2PlantumlCompilerException() {
    }

    public SqlDDL2PlantumlCompilerException(String message) {
        super(message);
    }

    public SqlDDL2PlantumlCompilerException(String message, Throwable cause) {
        super(message, cause);
    }

    public SqlDDL2PlantumlCompilerException(Throwable cause) {
        super(cause);
    }

    public SqlDDL2PlantumlCompilerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
