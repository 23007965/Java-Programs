package Backtracking;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> result = new ArrayList<>();
        permutation(input, "", result);
        System.out.println("Perms are \n" + result);
    }

    public static void permutation(String str, String perm, ArrayList<String> result) {
        if (str.isEmpty()) {
            result.add(perm);
            return; // Important: Stop recursion when a permutation is complete
        }
        for (int i = 0; i < str.length(); i++) {
            String curr = "" + str.charAt(i);
            String remainingStr = str.substring(0, i) + str.substring(i + 1);
            permutation(remainingStr, perm + curr, result);
        }
    }
}