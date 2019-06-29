import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static final String TYPE1 = "MyTest";
    private final String type2;

    public Anagram(String type2) {
        this.type2 = type2;
    }

    public String getType2() {
        return this.type2;
    }

    public boolean isAnagram(String args1, String args2) {
        if (args1 == null || args2 == null) {
            return false;
        }

        if (args1.length() != args2.length()) {
            return false;
        }

        // make sure it is not case sensitive!
        args1 = args1.toLowerCase();
        args2 = args2.toLowerCase();

        for (int i = 0; i < args1.length(); i++){
            char c1 = args1.charAt(i);

//            // BUG!
//            // if second word does not contain our character - indexOf() will return -1 and
//            // we know these words are not anagrams
//            if (args2.indexOf(c1) < 0) {
//                return false;
//            }

            int word2IndexOfThisChar = args2.indexOf(c1);
            if (word2IndexOfThisChar < 0) {
                return false;  // doesn't exist
            } else {
                // let's remove it from the second word
                args2 = args2.substring(0, word2IndexOfThisChar) + args2.substring(word2IndexOfThisChar + 1);
            }
        }

        return args2.length() == 0;
    }
