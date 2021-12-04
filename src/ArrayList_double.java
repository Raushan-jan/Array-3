import java.util.Arrays;
import java.util.Scanner;

public class
ArrayList_double {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        String s2 = new String(ch);
        System.out.println(s2);
        for (int i = 0; i < s2.length(); i++) {
            if (i != s2.lastIndexOf(s2.charAt(i)) && (i + 1 == s2.lastIndexOf(s2.charAt(i)))) {
                System.out.print(s2.charAt(i) + " ");
            }
        }

    }
}








