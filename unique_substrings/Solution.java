public class Solution {
    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        String input = keyboard.nextLine();
        if (input == null || input.length() == 0) {
            System.out.println(0);
        }
        java.util.List<String> suffices = new java.util.ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            suffices.add(input.substring(i, input.length()));
        }
        java.util.Collections.sort(suffices);
        int sum = suffices.get(0).length();
        for (int i = 0; i < suffices.size() - 1; i++) {
            sum += suffices.get(i + 1).length() - lcp(suffices.get(i), suffices.get(i + 1));            
        }
        System.out.println(sum);
    }

    /**
     * The length of the Longest Common Prefix of s1 and s2
     */
    private static int lcp(String s1, String s2) {
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return i;
            }
            i++;
        }
        return i;
    }
}