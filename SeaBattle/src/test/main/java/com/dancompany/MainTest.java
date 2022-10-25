package main.java.com.dancompany;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void outputLetters() {
        char[] test = new char[]{'a', 'b', 'c'};
        Main.outputLetters(test);
        Assert.assertEquals("a|b|c|\r\n", output.toString());
    }
}