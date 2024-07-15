//reverse a string
package Put_exam;

public class practice{
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("hello");
        for(int i=0;i<s.length()/2;i++)
        {
            int start=i;
            int end=s.length()-i-1;

            char s1=s.charAt(start);
            char s2=s.charAt(end);

            s.setCharAt(start, s2);
            s.setCharAt(end, s1);
        }
        System.out.println(s);
    }
}