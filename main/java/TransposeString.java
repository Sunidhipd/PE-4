import java.util.Arrays;
import java.util.Scanner;

public class TransposeString {

    public static String Transpose(String word){
         String res="";
         StringBuilder sb=new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            sb.append(word.charAt(i));
        }
        res=sb.toString();
        String s[]=res.split(" ");
        int i=s.length-1;
        res=s[i];
        for (i=s.length-2;i>=0;i--){
            res=res+" " +s[i];
        }
        return res;
    }
}
