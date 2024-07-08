package java_class;

public class reverse_a_string {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        for (int i = 0; i < s.length() / 2; i++) {
            int start = i;
            int back = s.length() - i - 1;
            
            // Swap characters at start and back indices
            char st = s.charAt(start);
            char bk = s.charAt(back);
            s.setCharAt(start, bk);
            s.setCharAt(back, st);
        }
        System.out.println(s); // This will print: olleh
    }
}
