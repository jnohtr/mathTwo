package com.company;

import java.util.Scanner;

public class mTHtWO {
    private static String name;

    public static void main(String[] args) {


	// write your code here
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = keyboard.nextLine();

        //name = Scanner
        System.out.println("Hello, " + name);
    }
}
