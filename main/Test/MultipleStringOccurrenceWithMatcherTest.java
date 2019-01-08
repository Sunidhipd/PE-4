import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MultipleStringOccurrenceWithMatcherTest {
    private static MultipleStringOccurrenceWithMatcher mat;

    @BeforeClass
    public static void setup(){
        mat= new MultipleStringOccurrenceWithMatcher();
    }

    @AfterClass
    public static void teardown(){
        mat=null;
    }

    @Test
    public void multipleStringOccurrenceSuccess() {
        String s="Selena sees a sea";
        String w="se";
        List<String> res=mat.stringOccurrence(s,w);
        List<String> ans=asList("7 - 9", "14 - 16");
        assertEquals(ans,res);
    }

    @Test
    public void multipleStringOccurrenceFailure() {
        String s = "Selena sees a sea";
        String w = "se";
        List<String> res = mat.stringOccurrence(s, w);
        List<String> ans = asList("0 - 2","7 - 9", "14 - 16");
        assertNotEquals(ans,res);
    }

    @Test
    public void multipleStringOccurrenceNotNull() {
        String s = "Hello Gim";
        String w = "se";
        List<String> res = mat.stringOccurrence(s, w);
        List<String> ans = asList("");
        assertNotEquals(ans,res);
    }
}