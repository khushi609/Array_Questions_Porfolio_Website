public class CharacterFrequency {

    public static void countCharacterFrequency(String str) {
      
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int frequency = 0;

            if (currentChar == '\0') {
                continue;
            }

          
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    frequency++;
                    
                    str = str.substring(0, j) + '\0' + str.substring(j + 1);
                }
            }

            
            System.out.println("'" + currentChar + "': " + frequency);
        }
    }

    public static void main(String[] args) {
       
        String input = "hello world";

        System.out.println("Character frequencies in the string:");
        countCharacterFrequency(input);
    }
}
