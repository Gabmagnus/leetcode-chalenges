package com.gabma.leetcode.reversewordsinastring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        List<String> words = new ArrayList<String>(Arrays.asList(s.split(" ")));
        StringBuilder finalResult = new StringBuilder();

        for (String value : words) {
            StringBuilder reversedWord = new StringBuilder();
            reversedWord.append(value).reverse();
            finalResult.append(reversedWord.toString() + " ");

        }
        return finalResult.toString().strip();
    }
}