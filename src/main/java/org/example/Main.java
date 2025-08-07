package org.example;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        String greeting = "Hello, Cadets!";
        int length = greeting.length();
        System.out.println("The length of the string is: " + length); // 14

        // Exercise 2
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: " + character); // l

        // Exercise 3
        String statement = "Java is powerful.";
        String part = statement.substring(5, 7);
        System.out.println("The extracted substring is: " + part); // "is"
    }
}