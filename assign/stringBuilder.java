package assign;
public class stringBuilder {
    public static void main(String[] args) {
       StringBuilder sb=new StringBuilder("tony");
       System.out.println(sb);
       //char at index 0
       System.out.println(sb.charAt(0));

       //set char at index 0
       sb.setCharAt(0,'m');
       System.out.println(sb);

       //insert at index
       sb.insert(0,'i');
       System.out.println(sb);

       //delete at index
       sb.delete(0,1);
       System.out.println(sb);

       //appending in string builder
       sb.append(" ");   //sb=sb+" "
       sb.append("h");    //sb=sb+'h';
       sb.append("e");
       sb.append("l");
       sb.append("l");
       sb.append('o');
       System.out.println(sb);

    }
}
