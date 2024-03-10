package edu.canisius.cyb.cyb600.lab2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public String method1(String stringToReverse) {
        if (stringToReverse == null) {
            return "";
        }
        StringBuilder reversedString = new StringBuilder(stringToReverse);
        reversedString.reverse();
        return reversedString.toString().toUpperCase();
    }

    public String method2(String reptedstring) {
        if (reptedstring == null || reptedstring.equals("")) {
            return "";
        }
        int length = reptedstring.length();
        char firstLetter = reptedstring.charAt(0);
        return String.valueOf(firstLetter).repeat(length) + reptedstring;
    }

    public String method3(String words) {
        if (words == null || words.equals("")) {
            return "";
        }
        String[] word = words.split(" "); // Split by spaces
        StringBuilder reversedString = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            reversedString.append(word[i]);
            if (i > 0) {
                reversedString.append(" "); // Add a space between words
            }
        }
        return reversedString.toString(); // Return the reversed string
    }
}