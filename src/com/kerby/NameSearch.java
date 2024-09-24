package com.kerby;
//Class NameSearch
//1. Create two ArrayLists to store names from the GIRLNAMES.TXT and BOYNAMES.TXT files
//2. Read the names from GIRLNAMES.TXT and store them in the girlNames ArrayList
//3. Read the names from BOYNAMES.TXT and store them in the boyNames ArrayList
//4. Prompt the user to enter a boy's name and/or a girl's name
//5. If the user enters a boy's name, search the boyNames ArrayList to see if it is among the most popular names
//6. If the user enters a girl's name, search the girlNames ArrayList to see if it is among the most popular names
//7. Display a message indicating whether the name was found among the most popular names

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch {

    public static void main(String[] args) {
        // Create ArrayLists to store the names from the files
        ArrayList<String> girlNames = new ArrayList<>();
        ArrayList<String> boyNames = new ArrayList<>();

        // Read the names from the GIRLNAMES.TXT file
        try {
            File girlFile = new File("GIRLNAMES.TXT");
            Scanner girlScanner = new Scanner(girlFile);

            while (girlScanner.hasNextLine()) {
                girlNames.add(girlScanner.nextLine());
            }
            girlScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("GIRLNAMES.TXT file not found.");
            return;
        }

        // Read the names from the BOYNAMES.TXT file
        try {
            File boyFile = new File("BOYNAMES.TXT");
            Scanner boyScanner = new Scanner(boyFile);

            while (boyScanner.hasNextLine()) {
                boyNames.add(boyScanner.nextLine());
            }
            boyScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("BOYNAMES.TXT file not found.");
            return;
        }

        // Get user input to search for names
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a boy's name
        System.out.print("Enter a boy's name to search (or press Enter to skip): ");
        String boyName = scanner.nextLine();

        // Prompt user for a girl's name
        System.out.print("Enter a girl's name to search (or press Enter to skip): ");
        String girlName = scanner.nextLine();

        // Search for the boy's name
        if (!boyName.isEmpty()) {
            if (boyNames.contains(boyName)) {
                System.out.println(boyName + " is among the most popular boy's names.");
            } else {
                System.out.println(boyName + " is not among the most popular boy's names.");
            }
        }

        // Search for the girl's name
        if (!girlName.isEmpty()) {
            if (girlNames.contains(girlName)) {
                System.out.println(girlName + " is among the most popular girl's names.");
            } else {
                System.out.println(girlName + " is not among the most popular girl's names.");
            }
        }

        scanner.close();
    }
}
//Explanation:

//- The NameSearch program reads two files, GIRLNAMES.TXT and BOYNAMES.TXT, each containing the most popular names for boys and girls.
//- The names are stored in two separate ArrayLists.
//- The user is prompted to enter a boy's name and/or a girl's name to search for.
//- The program checks whether the entered names are in the corresponding ArrayLists and displays a message indicating whether the name is among the most popular names.

