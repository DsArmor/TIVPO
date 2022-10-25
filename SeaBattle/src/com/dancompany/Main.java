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
        bd = new ArrayList(Arrays.asList("франция", "очки", "мандалорец", "геймпад", "наушники", "лекарство", "колонна"));
        String gameWord = bd.get(new Random().nextInt(bd.size()));
        char[] letterMas = new char[gameWord.length()];
        System.out.println("Your word contains" + gameWord.length() + "letters");
        while (!String.valueOf(letterMas).equals(gameWord)) {
            for (char l : letterMas){
                if (l == 0)
                    System.out.print(l + "|");
                else
                    System.out.print("_|");
            }
            System.out.println("Input letter");
            char c = in.next().charAt(0);
            int i = gameWord.indexOf(c);
            if (i != -1)
                letterMas[i] = c;
        }
        System.out.println("Congratulations");
    }
}
