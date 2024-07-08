package java_class;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("helloworld");
        System.out.println(s.charAt(0));
        s.setCharAt(0,'p');
        System.out.println(s.charAt(0));
        s.insert(1,'i');
        System.out.println(s);
        s.delete(1,2);
        System.out.println(s);
        s.append('o');
        s.append('o');
        System.out.println(s);
    }
}
