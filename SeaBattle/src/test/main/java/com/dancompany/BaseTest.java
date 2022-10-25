package main.java.com.dancompany;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class BaseTest {

    @Test
    public void getCharFinder() {
        Base base = new Base();
        String test = "test";
        Assert.assertArrayEquals(new char[test.length()], base.getCharFinder(test));
    }

    @Test
    public void getWord() {
        Base base = new Base();
        Assert.assertNotNull(base.getWord());
    }
}