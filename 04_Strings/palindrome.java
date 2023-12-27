package Strings;

public class palindrome {

    public static void checkPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrome
                System.out.println(str+" not a palindrome");
                return;
            }
        }
        System.out.println(str + " is a palindrome");
    }
    public static void main(String agrs[]){
        String s = "raceacar";
        checkPalindrome(s);
    }
}
