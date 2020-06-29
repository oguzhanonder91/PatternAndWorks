package leetcode;

public class PalindromNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(387));
    }
    public static  boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String newString ="";
        if(s.length()<10){
            for (int i = s.length()-1; i >= 0; i--) {
                if(s.charAt(i) != '-' && s.charAt(i) != 0){
                    newString = newString + (s.charAt(i));
                }else{
                    newString = "-" + newString;
                }

            }
        }

        if(newString.equals(s)){
            return true;
        }else{
            return false;
        }

    }
}
