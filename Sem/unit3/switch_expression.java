package unit3;
//switch expression
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class switch_expression {
    public static void main(String[] args) {
        Day day=Day.WEDNESDAY;
        int x=switch(day){
            case MONDAY,FRIDAY,SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY,SATURDAY -> 8;
            case WEDNESDAY ->9;
            default -> throw new IllegalStateException("invalid state");
        };
        System.out.println(x);
    }
}
