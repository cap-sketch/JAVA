package assign;
import java.util.Scanner;

public class TwoDArray {
    public static void printer(int rows,int columns,int array[][])
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int array[][]=new int[rows][columns];
        System.out.println("taking input: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        printer(rows,columns,array);

    }
}
