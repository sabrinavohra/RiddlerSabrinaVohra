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
        String[] split = encrypted.split(" ");
        for(int i = 0; i < split.length; i++) {
            decrypted += (char)Integer.parseInt(split[i]);
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        String current = "";
        String intValues = "";
        int value = 0;
        for(int i = 0; i < encrypted.length(); i++) {
            if(i % 8 == 0) {
                for(int j = 0; j < current.length(); j++) {
                    if(current.charAt(j) == '1') {
                        value += (1<<j);
                    }
                }
                intValues += (value + " ");
                current = "";
                value = 0;
            }
            else {
                current += encrypted.charAt(i);
            }
        }
        String[] split = intValues.split(" ");
        for(int i = 0; i < split.length; i++) {
            decrypted += (char)Integer.parseInt(split[i]);
        }

//            if(i % 7 == 0) {
//                for(int j = 0; j < current.length(); j++) {
//                    if(current.charAt(j) == 1) {
//                        value += (int) Math.pow(2, current.length() -1);
//                    }
//                }
//                intValues += value + " ";
//            }
//            else {
//                current += encrypted.charAt(i);
//            }
//        }
        // Split up the string into 8-character segments
        // Use binary to switch into ASCII
        // Change the ASCII values to their letter equivalents
        // Add to decrypted String
        System.out.println(decrypted);
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
