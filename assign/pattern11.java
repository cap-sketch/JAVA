package assign;
import java.util.*;
public class pattern11{
  public static void main(String[] args) {
    int n=5;
    int count=1;            
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<n-i+1;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print(i);
        System.out.print(" ");
      }
      for(int j=1;j<n-i+1;j++)
      {
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}