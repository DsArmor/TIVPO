package com.dancompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Base {

    private ArrayList<String> bd;

    public Base(){
        bd = new ArrayList(Arrays.asList("france", "glasses", "mandalor", "gamepad", "headphones", "remedy", "tower"));
    }

    public char[] getCharFinder(String gameWord) {
        return new char[gameWord.length()];
    }

    public String getWord() {
        return bd.get(new Random().nextInt(bd.size()));
    }
}
