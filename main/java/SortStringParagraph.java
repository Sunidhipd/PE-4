import java.util.Arrays;
import java.util.Scanner;

public class SortStringParagraph {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String Paragraph: ");
        String s=sc.nextLine();
        String res=Sort(s);
        System.out.println("Sorted Paragraph: "+ res );
    }

    public static String Sort(String S){
        String s[]=S.split(" ");
        Arrays.sort(s);
        String res="";
        res=Arrays.toString(s);
        return res;

    }
}
