import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalOccuranceOfaCharacterTest {
    private static TotalOccuranceOfaCharacter to;
    @BeforeClass
    public static void setup(){
        to= new TotalOccuranceOfaCharacter();
    }

    @AfterClass
    public static void teardown(){
        to=null;
    }

    @Test
    public void OccurenceSuccess() {
        String s="hello badass";
        String ch="s";
        int ans=to.diff(s,ch);
        assertEquals(2,ans);
    }
    @Test
    public void OccurenceFailure() {
        String s="hello badass";
        String ch="l";
        int ans=to.diff(s,ch);
        assertNotEquals(5,ans);
    }
    @Test
    public void OccurenceEmpty() {
        String s="";
        String ch="l";
        int ans=to.diff(s,ch);
        assertEquals(0,ans);
    }
    @Test
    public void OccurenceNull() {
        String s="hello badass";
        String ch="";
        int ans=to.diff(s,ch);
        assertEquals(0,ans);
    }



}