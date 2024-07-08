package assign;
public class reverseString {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("hello");
        for(int i=0;i<(s.length()/2);i++)
        {
            int front=i;
            int back=s.length()-1-i;
            char f=s.charAt(front);
            char b=s.charAt(back);
            s.setCharAt(front,b);
            s.setCharAt(back,f);
        }
        System.out.println(s);
    }
}
