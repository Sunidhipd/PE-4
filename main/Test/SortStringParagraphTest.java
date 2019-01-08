import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class SortStringParagraphTest {
    private static SortStringParagraph srt;

    @BeforeClass
    public static void setup(){
        srt= new SortStringParagraph();
    }

    @AfterClass
    public static void teardown(){
        srt=null;
    }

    @Test
    public void sortStringSuccess() {
        String s="Hello ram there you are!";
        String w="[Hello, are!, ram, there, you]";
        String f=srt.Sort(s);
        assertEquals(w,f);
    }

    @Test
    public void sortStringFailure() {
        String s="Hello ram there you are!";
        String w=" Hello, are!, ram, there, you ";
        String f=srt.Sort(s);
        assertNotEquals(w,f);
    }

    @Test
    public void sortStringNotNull() {
        String s="";
        String w="[]";
        String f=srt.Sort(s);
        assertEquals(w,f);
    }
    @Test
    public void sortStringNull() {
        String s="";
        String w="Wrong";
        String f=srt.Sort(s);
        assertNotEquals(w,f);
    }

}