package com.mab.core.bootcamp.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Javapedia is a free encyclopedia that anyone can edit. As a world-renowned editor,
 * your task is to submit information about famous historical figures.
 */
public class Javapedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many historical figures will you register?");
        int figures = scanner.nextInt();

        String[][] database = new String[figures][3];
        scanner.nextLine();//pitfall

        for (int i=0; i < database.length; i++) {

            System.out.print("Figure: " + (i + 1) + "\n");

            for (int j=0; j < database[i].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        database[i][j] = name;
                    break;
                    case 1:
                        System.out.print("Date of Birth: ");
                        String birthday = scanner.nextLine();
                        database[i][j] = birthday;
                    break;
                    case 2:
                        System.out.print("Occupation: ");
                        String occupation = scanner.nextLine();
                        database[i][j] = occupation;
                    break;
                }
            }
            System.out.print("\n");
        }

        printDatabaseContent(database);

        System.out.println("\nWho do you want more information on?");
        String name = scanner.nextLine();

        String[] resultFound = findResultByName(database, name);
        printSearchResults(resultFound);
    }

    private static void printDatabaseContent(String[][] database) {
        System.out.println("These are the values you stored: ");

        for(int i=0; i < database.length; i++) {
            for(int j=0; j < database[i].length; j++) {
                System.out.print(database[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private static String[] findResultByName(String[][] database, String name) {
        String[] result = new String[3];

        for(int i=0; i < database.length; i++) {
            for(int j=0; j < database[i].length; j++) {

                if(name.equals(database[i][j])) {
                    //System.out.println("Position [" + i + "][" + j + "]: " + database[i][j]);
                    result = Arrays.copyOf(database[i], result.length);
                }
            }
        }

        return result;
    }

    private static void printSearchResults(String[] result) {
        for(int i=0; i < result.length; i++) {
            switch (i) {
                case 0: System.out.print("Name: " + result[i] + "\n"); break;
                case 1: System.out.print("Date of birth: " + result[i] + "\n") ; break;
                case 2: System.out.print("Occupation: " + result[i] + "\n"); break;
            }
        }
    }
}
