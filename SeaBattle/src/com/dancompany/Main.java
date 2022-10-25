package com.dancompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static ArrayList<String> bd;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the game");
        bd = new ArrayList(Arrays.asList("france", "glasses", "mandalor", "gamepad", "headphones", "remedy", "tower"));
        String gameWord = bd.get(new Random().nextInt(bd.size()));
        char[] letterMas = new char[gameWord.length()];
        System.out.println("Your word contains " + gameWord.length() + " letters");
        while (!String.valueOf(letterMas).equals(gameWord)) {
            for (char l : letterMas){
                if (l != 0)
                    System.out.print(l + "|");
                else
                    System.out.print("_|");
            }
            System.out.println();
            System.out.println("Input letter");
            char c = in.next().charAt(0);
            for (int i = 0; i < gameWord.length(); i++)
                if (gameWord.charAt(i) == c)
                    letterMas[i] = c;
        }
        System.out.println("Congratulations");
    }
}
