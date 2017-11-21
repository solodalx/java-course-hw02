package sgu;

import java.util.*;

// Задача 2056 с http://acm.sgu.ru/lang/
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "", line = null;
//        while ((line = scanner.nextLine()).length() > 0) {
        while (scanner.hasNext()) {
//            input += line + "\n";
            input += scanner.nextLine() + "\n";
        }
        String delims = "[ \n]+";
        String[] words = input.split(delims);

        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            Integer count = wordCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordCount.put(word, count + 1);
//            System.out.println(word + ": " + (count + 1));
        }

        Integer max = Collections.max(wordCount.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getValue();
//        System.out.println(max);

        for (Map.Entry<String, Integer> set : wordCount.entrySet()) {
            if (set.getValue() == max) {
                System.out.println(set.getKey());
            }
        }

    }
}
