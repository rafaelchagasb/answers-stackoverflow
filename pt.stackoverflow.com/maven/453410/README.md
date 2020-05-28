Tente usar o 

    ${project.basedir} 

https://cwiki.apache.org/confluence/display/MAVEN/Maven+Properties+Guide

Você pode tentar imprimir as variáveis para verificar.

Coloquei um exemplo no [Github][1]. Basta executar o **mvn clean install** e verificar o arquivo properties.txt.

Fiz o teste no Ubuntu 20.04 e funcionou como esperado.

    <?xml version="1.0" encoding="UTF-8"?>
    <project>
    ...
        <build>
            <plugins>
                <plugin>
                    <groupId>ru.yaal.maven</groupId>
                    <artifactId>write-text-files-maven-plugin</artifactId>
                    <version>1.1</version>
                    <configuration>
                        <charset>UTF-8</charset>
                        <files>
                            <file>
                                <path>properties.txt</path>
                                <lines>
                                    <line>=== JAVA PROPERTIES ===</line>
                                    <line>Java vendor: ${java.vendor}</line>
                                    <line>Java version: ${java.version}</line>
                                    <line>Java home: ${java.home}</line>
                                    <line>=== OS ENVIRONMENT ===</line>
                                    <line>User dir: ${env.HOME}</line>
                                    <line>=== MAVEN SETTINGS.XML ===</line>
                                    <line>Offline: ${settings.offline}</line>
                                    <line>=== Maven Properties Guide ===</line>
                                    <line>Description:                          ${project.description}</line>
                                    <line>project.basedir:                      ${project.basedir} </line>
                                    <line>project.build.directory:              ${project.build.directory}</line>
                                    <line>project.build.outputDirectory:        ${project.build.outputDirectory}</line>
                                    <line>project.build.testOutputDirectory:    ${project.build.testOutputDirectory}</line>
                                    <line>project.build.sourceDirectory:        ${project.build.sourceDirectory}</line>
                                    <line>project.build.testSourceDirectory:    ${project.build.testSourceDirectory}</line>
                                    <line>project.build.finalName:              ${project.build.finalName}</line>
                                    <line>project.version:                      ${project.version}</line>
                                    <line>settings.localRepository:             ${settings.localRepository}</line>
                                    <line>basic:                                ${basic}</line>
                                </lines>
                            </file>
                        </files>
                    </configuration>
                    <executions>
                        <execution>
                            <id>write-text-files</id>
                            <phase>prepare-package</phase>
                            <goals>
                                <goal>write-text-files</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>
            </plugins>
        </build>
    </project>



  [1]: https://github.com/rafaelchagasb/answers-stackoverflow/blob/master/pt.stackoverflow.com/maven/453410/example/pom.xml 
