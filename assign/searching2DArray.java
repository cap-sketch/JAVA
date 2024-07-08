package assign;
import java.util.Scanner;

public class searching2DArray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("no of rows and columns in matrix: ");
        int rows=ob.nextInt();
        int columns=ob.nextInt();
        int array[][]=new int[rows][columns];
        System.out.println("enter the input of matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array[i][j]=ob.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter the element to be searched: ");
        int x=ob.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(x==array[i][j])
                {
                System.out.println("the indices are "+i+" "+j);
                return;
                }

            }
        }
    }
}
