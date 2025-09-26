import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(parenthesesCheck(")(())("));
        System.out.println(reverseInteger(1234));
    }
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String s) {
        int open = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                open++;
            } else if (s.charAt(i) == ')'){
                open--;
            }
        }
        return open == 0;
    }

    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String reversed = "";
        String numString = Integer.toString(n);
        for (int i = (numString.length()-1); i >= 0; i--){
            reversed += (numString.charAt(i));
        }
        return reversed;
    }


    // 3. encryptThis
    public static String encryptThis(String input) {
        return "";
    }


    // 4. decipherThis
    public static String decipherThis(String input) {
        return "";
    }

}
