package com.kerby;

import java.util.ArrayList;

public class PhoneBookArrayList {

    public static void main(String[] args) {
        // Create an ArrayList to store PhoneBookEntry objects
        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();

        // Add at least five entries to the phone book
        phoneBook.add(new PhoneBookEntry("John Doe", "555-1234"));
        phoneBook.add(new PhoneBookEntry("Jane Smith", "555-5678"));
        phoneBook.add(new PhoneBookEntry("Alice Johnson", "555-8765"));
        phoneBook.add(new PhoneBookEntry("Bob Brown", "555-4321"));
        phoneBook.add(new PhoneBookEntry("Charlie White", "555-1111"));

        // Use a loop to display the contents of each object in the ArrayList
        System.out.println("Phone Book Entries:");
        for (PhoneBookEntry entry : phoneBook) {
            System.out.println(entry);
        }
    }
}
