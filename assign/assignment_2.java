package assign;

import java.util.Scanner;

public class assignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int A[]=new int[N];
        int count=0;
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(K <A[i])
            {
                A[i]++;
                count++;
            }
        }
        System.out.println("it will take "+count+" seconds");
    }
}
