package main.java.com.dancompany;

import main.java.com.dancompany.Base;

import java.util.Scanner;

public class Main {

    public static void outputLetters(char [] letterMas) {
        for (char l : letterMas){
            if (l != 0)
                System.out.print(l + "|");
            else
                System.out.print("_|");
        }
        System.out.println();
    }

    public static void game(char [] letterMas, String gameWord) {
        Scanner in = new Scanner(System.in);
        while (!String.valueOf(letterMas).equals(gameWord)) {
            outputLetters(letterMas);
            System.out.println("Input letter");
            char c = in.next().charAt(0);
            for (int i = 0; i < gameWord.length(); i++)
                if (gameWord.charAt(i) == c)
                    letterMas[i] = c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the game");
        Base base = new Base();
        String gameWord = base.getWord();
        char [] letterMas = base.getCharFinder(gameWord);
        System.out.println("Your word contains " + gameWord.length() + " letters");
        game(letterMas, gameWord);
        System.out.println("Congratulations: " + gameWord);
    }
}
