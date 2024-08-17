package unit3;
//switch statement allows to choose one statement from multiple conditions.
//it is like if-else if ladder.
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class switch_statement {
    public static void main(String[] args) {
        int x=0;
        Day day=Day.WEDNESDAY;
        switch(day)
        {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
               x=6;
               break;
            case TUESDAY:
               x=7;
               break;
            case THURSDAY:
            case SATURDAY:
               x=8;
               break;
            case WEDNESDAY:
               x=9;
               break;
            default:
             System.out.println("invalid day");

        }
        System.out.println(x);
    }
}
