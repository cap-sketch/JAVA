//inverted half pyramid with numbers
public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            int p=1;
            for(int j=n;j>=i;j--)
            {
                
                System.out.print(p);
                p++;
            }
            System.out.println();
        }
    }
}
