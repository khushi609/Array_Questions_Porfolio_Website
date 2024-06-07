public class removeLowercase {

   
    public static String removeLowercase(String str) {
        StringBuilder result = new StringBuilder();

        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        String input = "Hello World";

 
        String result = removeLowercase(input);

        
        System.out.println("Original String: " + input);
        System.out.println("Resulting String: " + result);
    }
}
