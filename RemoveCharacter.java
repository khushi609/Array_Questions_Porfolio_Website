public class RemoveCharacter {

    public static String removeAllOccurrencesOfChar(String input, char c) {
        int len = input.length();
        char[] result = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (input.charAt(i) != c) {
                result[count++] = input.charAt(i);
            }
        }

        
        return new String(result, 0, count);
    }

    public static void main(String[] args) {
      
        String str = "hello world";
        char c = 'o';

        String result = removeAllOccurrencesOfChar(str, c);
        System.out.println("Original String: " + str);
        System.out.println("Character to remove: " + c);
        System.out.println("Resulting String: " + result);
    }
}
