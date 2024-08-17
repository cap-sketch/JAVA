package unit3;
//yield keyword
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class yield_keyword {
    public static void main(String[] args) {
        Day day=Day.WEDNESDAY;
        int x=switch(day){
            case MONDAY,FRIDAY,SUNDAY -> yield 6;
            case TUESDAY -> 7;
            case THURSDAY,SATURDAY -> yield 8;
            case WEDNESDAY -> yield 9;
            default -> throw new IllegalStateException("invalid state");
        };
        System.out.println(x);
    }
}
