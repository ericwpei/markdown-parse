import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;


//To compile/run:
//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

public class MarkdownParseTestLab8 {
    @Test
    public void testSnippet1() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("`google.com");
        linkTester.add("google.com");
        linkTester.add("ucsd.edu");

        Path fileName = Path.of("test-snippet1.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testSnippet2() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("a.com");
        linkTester.add("a.com(())");
        linkTester.add("example.com");

        Path fileName = Path.of("test-snippet2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }

    @Test
    public void testSnippet3() throws IOException{
        ArrayList<String> linkTester = new ArrayList<>();
        linkTester.add("https://ucsd-cse15l-w22.github.io/");

        Path fileName = Path.of("test-snippet3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(linkTester, links);
    }
}