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

    public String decryptOne(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptOne() function.
        for(int i = 0; i < encrypted.length(); i++) {
            String currentLetter = encrypted.substring(i,i+1);
            for(int j = 0; j < NUM_LETTERS; j++) {
                if(ALPHABET.substring(j,j+1).equals(currentLetter)) {
                    int num = j - 17;
                    if(num < 0) {
                        num = NUM_LETTERS - num;
                    }
                    decrypted += ALPHABET.charAt(num);
                }
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptTwo() function.
        // Split up each chunk of numbers into the appropriate size
        // Decode by changing numbers into their ASCII letter assignments
        // Print the new letter assignments
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        // TODO: Complete the decryptThree() function.
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
