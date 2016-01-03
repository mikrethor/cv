# cv

Maven project that shows doxia formats of my resume in [english](http://mikrethor.github.io/cv/0.0.1-SNAPSHOT/) and in [french](http://mikrethor.github.io/cv/0.0.1-SNAPSHOT/fr).

## Site generation

In order to generate a site you have to use this goal :
```
mvn site:site 
```

## Pdf generation

In order to generate a pdf you have to use this goal :
```
mvn pdf:pdf 
```

See this [file](https://github.com/mikrethor/cv/blob/master/parent/src/site/pdf.xml) to change the pdf content.

## Book generation

The book generation is done during site phase. To undestand book generation see the folowing :
```
<plugin>
				<groupId>org.apache.maven.doxia</groupId>
				<artifactId>doxia-book-maven-plugin</artifactId>
				<dependencies>
					<dependency>
						<groupId>org.apache.maven.doxia</groupId>
						<artifactId>doxia-module-fml</artifactId>
						<version>1.6</version>
					</dependency>
				</dependencies>
				<executions>
					<execution>
						<phase>pre-site</phase>
						<goals>
							<goal>render-books</goal>
						</goals>
					</execution>
				</executions>
				<configuration>

					<books>

						<book>
							<directory>src/site/xdoc/cv/</directory>
							<descriptor>src/site/bookdescriptors/book_cvxdoc.xml</descriptor>

							<formats>
								<!-- <format> <id>latex</id> </format> <format> <id>xdoc</id> </format> -->
								<format>
									<id>pdf</id>
								</format>
								<!--<format> <id>rtf</id> </format> -->


							</formats>
						</book>
						<book>
							<directory>src/site/docbook/cv/</directory>
							<descriptor>src/site/bookdescriptors/book_cvdocbook.xml</descriptor>
							<formats>
								<!-- <format> <id>latex</id> </format> <format> <id>xdoc</id> </format> -->
								<format>
									<id>pdf</id>
								</format>
								<!--<format> <id>rtf</id> </format> -->
							</formats>
						</book>
						<book>
							<directory>src/site/apt/cv/</directory>
							<descriptor>src/site/bookdescriptors/book_cvapt.xml</descriptor>
							<formats>
								<!-- <format> <id>latex</id> </format> -->
								<format>
									<id>xdoc</id>
								</format>
								<format>
									<id>pdf</id>
								</format>
								<format>
									<id>doc-book</id>
								</format>
								<format>
									<id>rtf</id>
								</format>
							</formats>

						</book>
						<book>
							<directory>src/site/fml/cv/</directory>
							<descriptor>src/site/bookdescriptors/book_cvfml.xml</descriptor>
							<formats>
								<!-- <format> <id>latex</id> </format> <format> <id>xdoc</id> </format> -->
								<format>
									<id>pdf</id>
								</format>
								<!--<format> <id>rtf</id> </format> -->
							</formats>
						</book>
					</books>
				</configuration>
			</plugin>
```
