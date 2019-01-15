import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToFindHarry {

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
