/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Sabrina Vohra
 */
public class Riddler {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final int NUM_LETTERS = 26;
    private static final int BINARY_SIZE = 8;

    public String decryptOne(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptOne() function.
        for(int i = 0; i < encrypted.length(); i++) {
            char currentCharacter = encrypted.charAt(i);
            if(currentCharacter >= 'A' && currentCharacter <= 'Z') {
                decrypted += (char)(((currentCharacter - 'A' + 9) % 26) + 'A');
            }
            else if(currentCharacter >= 'a' && currentCharacter <= 'z') {
                decrypted += (char)(((currentCharacter - 'a' + 9) % 26) + 'a');
            }
            else {
                decrypted += currentCharacter + " ";
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String currentNumber;
        char add = '\0';
        // TODO: Complete the decryptTwo() function.
        for(int i = 0; i < encrypted.length(); i++) {
            currentNumber = encrypted.substring(i, i+1);
            if(encrypted.substring(i, i+1) == " ") {
                int num = Integer.parseInt(currentNumber);
                add = (char)num;
            }
            else {
                currentNumber += currentNumber;
            }
            decrypted += add;
        }
        // Split up each chunk of numbers into the appropriate size
        // Decode by changing numbers into their ASCII letter assignments
        // Print the new letter assignments
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        String currentNumber = "";
        char add = '\0';
        // TODO: Complete the decryptThree() function.
        for(int i = 0; i <  encrypted.length(); i++) {
            currentNumber += encrypted.substring(i,i+1);
            if(currentNumber.length() == BINARY_SIZE) {
                int ascii = Integer.parseInt(currentNumber, 2);
                add = (char)ascii;
            }
            decrypted += add;
        }
        // Split up the string into 8-character segments
        // Use binary to switch into ASCII
        // Change the ASCII values to their letter equivalents
        // Add to decrypted String
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptFour() function.
        // Test cases: does truck = space?
        // Figure out 7 letter word that matches between them and find letters to decode
        return decrypted;
    }
}
