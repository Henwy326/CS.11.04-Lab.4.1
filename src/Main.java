import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(parenthesesCheck(")(())("));
        System.out.println(reverseInteger(1234));
        System.out.println(encryptThis("Ready set go"));
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
    public static String encryptWord(String input) {
        char firstLetter = input.charAt(0);
        int charCode = (int) firstLetter;
        char secondCharacter = input.charAt(input.length()-1);
        char lastCharacter = 'A';
        if (input.length() > 1){
            lastCharacter = input.charAt(1);

        }
        String encryptedWord;

        if (input.length() > 2){
            encryptedWord = charCode + "" + secondCharacter + "" + input.substring(2,input.length()-1) + "" + lastCharacter; 
        }else if (input.length() > 1){
            encryptedWord = charCode + "" + input.charAt(1);
        }else{
            encryptedWord = firstLetter + "";
        }
        return encryptedWord;
    }
    public static String encryptThis(String input) {
        String[] inputWords = input.split(" ");
        String encryptedString = "";
        for (int i = 0; i < inputWords.length; i++){
            encryptedString += encryptWord(inputWords[i]) + " ";
        }
        return encryptedString;
    }
    


    // 4. decipherThis
    public static String decipherThis(String input) {
        return "";
    }

}
