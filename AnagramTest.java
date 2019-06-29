import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramTest {
    @Test
    public void testIsAnagram_bothNulls_returnsFalse() {
        Anagram a1 = new Anagram("Lana");
        Anagram a2 = new Anagram("Katya");

        // type1 is a static variable - belongs to the class - usually stays static
        // type2 is an instance variable - belongs to the object (instance of class) - usually changes

        // usually: static methods are some helper / utility methods
        // usually: static variables - some constants to be reused in multiple places
        System.out.println("A1 Type1: " + Anagram.TYPE1);
        System.out.println("A1 Type2: " + a1.getType2());

        System.out.println("A2 Type1: " + Anagram.TYPE1);
        System.out.println("A2 Type2: " + a2.getType2());


        boolean result = new Anagram("Lana").isAnagram(null, null);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsAnagram_MaryArmy_returnsTrue(){
        boolean result = new Anagram("").isAnagram("Mary", "Army");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsAnagram_PoolPlop_returnsFalse(){
        boolean result = new Anagram("").isAnagram("Pool", "Plop");
        Assert.assertFalse(result);
    }

    @Test
    public void dummyTest() {
        List<Integer> fakeA = new ArrayList(Arrays.asList(5, 6, 7));
        List<Integer> fakeB = new ArrayList(Arrays.asList(3, 6, 10));
        Anagram.compareTriplets(fakeA, fakeB);
    }
}
