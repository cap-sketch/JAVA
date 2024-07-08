package assign;
import java.util.Scanner;

public class combineString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings");
        int n=sc.nextInt();
        String arr[]=new String[n];
        int totallength=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
            totallength+=arr[i].length();
        }
        System.out.println(totallength);
    }
}
