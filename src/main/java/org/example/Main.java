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

        // Exercise 4
        String mixedCase = "This Is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        // Exercise 5
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexOfFox = sentence.indexOf("fox");
        int indexOfZ = sentence.indexOf("z");
        int indexOfCat = sentence.indexOf("cat");
        System.out.println("Index of 'fox': " + indexOfFox); // 16 (first letter 'f' is at index 16)
        System.out.println("Index of 'z': " + indexOfZ); // 37
        System.out.println("Index of 'cat': " + indexOfCat); // -1 (not in the string)

    }
}