public class checkPalindrome {

    // Method to check if a string is a palindrome
    boolean checkPalindrome(String str) {
        int n = str.length();  //length
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
            i++;
            j--;
        }
        return true;  
    }

    public static void main(String[] args) {
        checkPalindrome p = new checkPalindrome();

        // Example string to check
        String str = "abab";

        if (p.checkPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
