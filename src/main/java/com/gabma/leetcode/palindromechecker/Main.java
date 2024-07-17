package com.gabma.leetcode.palindromechecker;

public class Main {

    public static void main(String[] args) {
        isPalindrome(" ");
    }

    public static boolean isPalindrome(String s) {
        StringBuilder correctStringInput = new StringBuilder();

        for (char value : s.toCharArray()) {
            if (Character.isAlphabetic(value) || Character.isDigit(value)) {
                correctStringInput.append(Character.toLowerCase(value));
            }
        }

        return correctStringInput.toString().contentEquals(correctStringInput.reverse());
    }

    public static boolean isPalindromee(String s) {
        StringBuilder correctStringInput = new StringBuilder();

        for (char value : s.toCharArray()) {
            if (Character.isAlphabetic(value) || Character.isDigit(value)) {
                correctStringInput.append(Character.toLowerCase(value));
            }
        }

        return correctStringInput.toString().contentEquals(correctStringInput.reverse());
    }
}
