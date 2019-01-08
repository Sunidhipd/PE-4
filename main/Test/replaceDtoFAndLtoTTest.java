import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class replaceDtoFAndLtoTTest {
    private static replaceDtoFAndLtoT rep;

    @BeforeClass
    public static void setup(){
        rep= new replaceDtoFAndLtoT();
    }
    @AfterClass
    public static void teardown(){
        rep=null;
    }

    @Test
    public void replaceSuccess() {
        String s="Difference of l and t and d to f";
        String res=rep.diff(s);
        assertEquals("Difference of t anf t anf f to f",res);
    }

    @Test
    public void replaceFailure() {
        String s="Difference of l and t and d to f";
        String res=rep.diff(s);
        assertNotEquals("Difference of l anf t anf d to f",res);
    }
    @Test
    public void replaceNull() {
        String s="";
        String res=rep.diff(s);
        assertNotNull("",res);
    }

}