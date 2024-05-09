package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello player 1! Enter your name: ");
        String namePlayer1 = scanner.nextLine();

        System.out.print("\n\nHello player 2! Enter your name: ");
        String namePlayer2 = scanner.nextLine();

        Deck deck = new Deck();

        deck.shuffle();

        Hand handPlayer1 = new Hand();

        handPlayer1.deal();

    }
}
