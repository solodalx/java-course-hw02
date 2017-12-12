package sgu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void test1() throws Exception {

        String input = "Sebastian Vettel is a German Formula One racing driver currently driving for Red Bull Racing\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        Solution.main(null);

        assertEquals("racing\r\n", outContent.toString());
    }

    @Test
    public void test2() throws Exception {

//        String input = "a aa aaa aaaa\na aa aaa bbbb\n\n";
        String input = "aaa aa a aaaa\na aa aaa bbbb\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        Solution.main(null);

        assertEquals("a\r\naa\r\naaa\r\n", outContent.toString());
    }
}