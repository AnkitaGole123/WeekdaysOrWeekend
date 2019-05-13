import java.util.*;
public class WeekdaysWeekends {
    public static void main(String[] args) {
        String days = args[0].toLowerCase();
        Set<String> weekDays = new HashSet<>(List.of("monday", "tuesday", "wednesday", "thursday", "friday"));
        if (getWeekends(days)) {
            System.out.println("weekends");
        } else if (weekDays.contains(days)) {
            System.out.println("week days");
        } else {
            System.out.println("invalid input");
        }
    }
    private static boolean getWeekends(String days) {
        return days.equals("saturday") || days.equals("sunday");
    }
}
