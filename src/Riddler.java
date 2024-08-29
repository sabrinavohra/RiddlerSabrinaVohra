/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Sabrina Vohra
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        for(int i = 0; i < encrypted.length(); i++) {
            // Initializes the current character to perform changes on
            char currentCharacter = encrypted.charAt(i);
            // Changes capital letters to its correct value by shifting by 9 characters
            if(currentCharacter >= 'A' && currentCharacter <= 'Z') {
                decrypted += (char)(((currentCharacter - 'A' + 9) % 26) + 'A');
            }
            // Changes lowercase letters to their correct values by shifting 9 characters
            else if(currentCharacter >= 'a' && currentCharacter <= 'z') {
                decrypted += (char)(((currentCharacter - 'a' + 9) % 26) + 'a');
            }
            // Keeps any other character the same
            else {
                decrypted += currentCharacter + " ";
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Splits encrypted message into sections based on spaces
        String[] split = encrypted.split(" ");
        // Changes each split into its character equivalent
        for(int i = 0; i < split.length; i++) {
            decrypted += (char)Integer.parseInt(split[i]);
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        // Initializes variables for for-loop
        String decrypted = "";
        String current = "";
        String intValues = "";
        int value = 0;
        for(int i = 0; i < encrypted.length(); i++) {
            // Splits characters into chunks of 8 for the length of the binary codes
            if(i % 8 == 0) {
                for(int j = 0; j < current.length(); j++) {
                    // Checks if the chars are 1s
                    if(current.charAt(j) == '1') {
                        // Adds together char values if they are 1s
                        value += (1<<(7 - j - 1));
                    }
                }
                // Restarts process for each split
                intValues += (value + " ");
                current = "";
                value = 0;
            }
            // Adds other characters to current string to be decoded when there are 8 characters
            else {
                current += encrypted.charAt(i);
            }
        }
        // Converts ASCII values into characters
        String[] split = intValues.split(" ");
        for(int i = 0; i < split.length; i++) {
            decrypted += (char)Integer.parseInt(split[i]);
        }
        // Deletes faulty first character
        decrypted = decrypted.substring(1);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        // Initializes shift
        int move = 0x2700;
        for(int i = 0; i < encrypted.length(); i++) {
            // Pulls out each part of the String
            int symbol = encrypted.charAt(i);
            // Converts each character to alphabetical character
            decrypted += (char)((symbol - move) + 'A');
        }
        return decrypted;
    }
}
