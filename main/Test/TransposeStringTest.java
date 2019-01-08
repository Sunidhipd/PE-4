import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    private static TransposeString trans;

    @BeforeClass
    public static void setup(){
        trans= new TransposeString();
    }

    @AfterClass
    public static void teardown(){
        trans=null;
    }

    @Test
    public void transposeSuccess() {
        String  s="Hello Dear";
        String res="olleH raeD";
        assertEquals(res,trans.Transpose(s));
    }
    @Test
    public void transposeFailure() {
        String  s="Hello Dear";
        String res="raeD olleH ";
        assertNotEquals(res,trans.Transpose(s));
    }
    @Test
    public void transposeNull() {
        String  s="";
        String res="";
        assertNotNull(res,trans.Transpose(s));
    }
}