public class reverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String original) {
        int length = original.length();
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return reversed;
    }
}

