classpath = .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar
runner = org.junit.runner.JUnitCore

test: MarkdownParse.class MarkdownParseTest.class
	java -cp ${classpath} ${runner} MarkdownParseTest

lab8: MarkdownParse.calss MarkdownParseTestLab8.class
	java -cp ${classpath} ${runner} MarkdownParseTestLab8

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp ${classpath} MarkdownParseTest.java

MarkdownParseTestLab8.class: MarkdownParseTestLab8.java
	javac -cp ${classpath} MarkdownParseTestLab8.java

	