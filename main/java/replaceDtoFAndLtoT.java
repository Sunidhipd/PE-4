import java.util.Scanner;

public class replaceDtoFAndLtoT {
  
    public String diff(String S){
        String newSs="",newS="";
        newSs=S.replaceAll("d","f");
        newS=newSs.replaceAll("l","t");
        return newS;

    }
}

