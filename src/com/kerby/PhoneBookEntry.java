package com.kerby;
//Class PhoneBookEntry
//1. Create fields to store a person's name and phone number
//2. Create a constructor to initialize the name and phone number
//3. Create accessors (getName, getPhoneNumber) and mutators (setName, setPhoneNumber) for the fields
//4. Create a toString method to return the entry's details as a string

//Class PhoneBookArrayList
//1. Create an ArrayList to store PhoneBookEntry objects
//2. Add at least five PhoneBookEntry objects to the ArrayList with sample data
//3. Loop through the ArrayList and display each entry's details using the toString method


public class PhoneBookEntry {
    // Fields for name and phone number
    private String name;
    private String phoneNumber;

    // Constructor to initialize name and phone number
    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    // Mutator for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Mutator for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to display the entry details
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }



    }

//Explanation:

//- The PhoneBookEntry class contains fields for a person's name and phone number, along with accessor and mutator methods.
//- The PhoneBookArrayList class creates an ArrayList to store PhoneBookEntry objects.
//- At least five phone book entries are added to the ArrayList, and a loop is used to display the details of each entry.

