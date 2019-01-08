import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToFindHarry {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        int res=isHarry(s);
        if(res==1)
            System.out.println("Is Harry here ? true");
        else
            System.out.println("Is Harry here ? False");

    }

    public static int isHarry(String s){
        String regex="Harry";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(s);
        while (matcher.find()){
            return 1;
        }
        return 0;
    }
}
