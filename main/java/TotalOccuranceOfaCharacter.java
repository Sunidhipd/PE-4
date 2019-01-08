import java.util.Scanner;

public class TotalOccuranceOfaCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.print("Enter character to find it's occurance: ");
        //char ch = sc.next().charAt(0);
        String ch=sc.nextLine();
        int res=diff(s,ch);
        System.out.println("Occurance of "+ ch + ": "+ res);
    }

    public static int diff(String s, String ch){
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
