# java-compiler-template
Template für antlr basierte Compiler in Java


## Projekt Erzeugung

1. gitignore erstellen
    * https://www.toptal.com/developers/gitignore/api/windows,linux,intellij+all,eclipse,maven,java,git
2. pom erstellen
    ```
   <project>
      <modelVersion>4.0.0</modelVersion>
      <groupId>com.github.huluvu424242</groupId>
      <artifactId>java-compiler-template</artifactId>
      <version>1</version>
    </project>
    ```
3. maven wrapper erstellen:
   ```
   mvn wrapper:wrapper -Dtype=source
   oder
   mvn wrapper:wrapper -Dtype=script
   ```