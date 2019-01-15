import java.util.Scanner;

public class TotalOccuranceOfaCharacter {

    public int diff(String s, String ch){
        int len = s.length();
        int fnal=0;
        if(ch.isEmpty()) {  return 0;}
        else{
            int l = s.replaceAll(ch, "").length();
            fnal = len - l;
            return fnal;
         }
    }
}
