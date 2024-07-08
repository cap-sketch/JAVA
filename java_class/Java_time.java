package java_class;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Java_time {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime ld=LocalDateTime.now();
        System.out.println(ld);
        
    }
}
