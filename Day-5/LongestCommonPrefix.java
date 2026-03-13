import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String s[] = {"Flower", "Flow", "Flowery"};

        // Convert to lowercase to avoid case mismatch
        for(int i = 0; i < s.length; i++){
            s[i] = s[i].toLowerCase();
        }

        Arrays.sort(s);

        String first = s[0];
        String last = s[s.length - 1];

        int count = 0;

        for (int i = 0; i < first.length() && i < last.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                count++;
            } else {
                break;
            }
        }

        if (count == 0) {
            System.out.println("No Common Prefix");
        } else {
            System.out.println("Longest Common Prefix: " + first.substring(0, count));
        }
    }
}