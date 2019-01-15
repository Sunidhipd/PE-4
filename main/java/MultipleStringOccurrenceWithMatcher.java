import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleStringOccurrenceWithMatcher {

    public static List<String> stringOccurrence(String s,String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(s);
        List<String> res=new ArrayList<String>();
        String in="";
        while (matcher.find()) {
            in="";
            in=in+matcher.start();
            in=in+" "+"-"+" ";
            in=in+matcher.end();
            res.add(in);
        }
        System.out.println(res);
        return res;
    }
}
