public class Anagram2 {
    public static int minSteps(String s, String t) {
    int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        int steps = 0;

        for (int num : count) {
            if (num > 0) steps += num;
        }

        return steps;
    }

    public static void main(String[] args) {
        System.out.println(minSteps("race", "aba")); 
    }
}