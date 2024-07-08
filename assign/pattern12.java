package assign;
public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            int count=2;
            for(int j=1;j<i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println("");
        }
    }
}
