public class reverse_string {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("hello");
        for(int i=0;i<s.length()/2;i++)
        {
            int start=i;
            int back=s.length()-i-1;

            char st=s.charAt(start);
            char bk=s.charAt(back);

            s.setCharAt(start,bk);
            s.setCharAt(back, st);

        }
        System.out.println(s);
    }
}
