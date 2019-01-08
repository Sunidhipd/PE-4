import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class RegexToFindHarryTest {


    private static RegexToFindHarry reg;

    @BeforeClass
    public static void setup(){
        reg= new RegexToFindHarry();
    }

    @AfterClass
    public static void teardown(){
        reg=null;
    }

    @Test
    public void isHarrySuccess() {
        String s="hello Harry!";
        int r=reg.isHarry(s);
        assertEquals(1,r);

    }


    @Test
    public void isHarryFailure() {
        String s = "Selena sees a sea";
        int r=reg.isHarry(s);
        assertEquals(0,r);
    }

    @Test
    public void isHarryNotNull() {
        String s = "";
        int r=reg.isHarry(s);
        assertEquals(0,r);
    }
}