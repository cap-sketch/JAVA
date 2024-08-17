public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("hello brother");
        System.out.println(s.charAt(0));
        s.setCharAt(0,'b');
        System.out.println(s);
        s.insert(1,"boy");
        System.out.println(s);
        s.append("boy");
        System.out.println(s);
        s.delete(2,5);
        System.out.println(s);
    }
}
