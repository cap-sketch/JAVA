package assign;
public class reverseAString2 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("hello");
        char arr[]=new char[s.length()];
        int n=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(n);
            n--;
        }
        for(int i=0;i<s.length();i++)
        {
            s.setCharAt(i,arr[i]);
        }
        System.out.println(s);




    }
}
