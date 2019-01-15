import java.util.Arrays;
import java.util.Scanner;

public class SortStringParagraph {
  
    public String Sort(String S){
        String s[]=S.split(" ");
        Arrays.sort(s);
        String res="";
        res=Arrays.toString(s);
        return res;

    }
}
