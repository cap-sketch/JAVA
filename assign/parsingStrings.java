package assign;
public class parsingStrings {
    public static void main(String[] args) {
        String n="123";
        n=n+1;
        //using paring we can convert a string into integer
        int a=Integer.parseInt(n);
        a++;
        System.out.println(n);
        System.out.println(a);
        //converting integer into string
        n=Integer.toString(a);
        System.out.println(n);
    }
}
