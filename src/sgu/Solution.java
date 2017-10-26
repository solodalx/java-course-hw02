package sgu;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Stream.of;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        String input = scanner.nextLine();
        String delims = "[ \n]+";
        String[] words = input.split(delims);

        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        for (String word : words) {
            int count = wordCount.get(word);
            wordCount.put(word, count + 1);
        }


    }


}
