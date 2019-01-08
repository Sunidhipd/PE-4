import java.util.Scanner;

public class replaceDtoFAndLtoT {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        String res=diff(s);
        System.out.println("New String: "+ res );
    }

    public static String diff(String S){
        String newSs="",newS="";
        newSs=S.replaceAll("d","f");
        newS=newSs.replaceAll("l","t");
        return newS;

    }
}

