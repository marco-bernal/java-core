package com.mab.core.bootcamp.scanner;

import java.util.Scanner;

public class ScannerExample {

    /**
     * Basic usage of Scanner to read input from the user.
     * @param args main function args.
     */
    public static void main(String[] args) {

        System.out.println("Scanner example.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Age:");
        int age = scanner.nextInt();

        System.out.println("Username:");
        scanner.nextLine();
        String username = scanner.nextLine();

        System.out.println("City:");
        String city = scanner.nextLine();

        System.out.println("Country:");
        String country = scanner.nextLine();

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Username:" + username);
        System.out.println("City:" + city);
        System.out.println("Country:" + country);
    }
}
