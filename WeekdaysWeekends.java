import java.util.*;
public class WeekdaysWeekends {
    public static void main(String[] args) {
        String days = args[0].toLowerCase();
        Set<String> weekDays = new HashSet<>(List.of("monday","tuesday","wednesday","thursday","friday"));
        if(getWeekends(days)) {
            System.out.println("weekends");
        }
        else if(days.contains(days)){
            System.out.println("week days ");
        }
        else {
            System.out.println("invalid input");
        }
    }
    private static boolean getWeekends(String weekends) {
        return weekends.equals("saturday") || weekends.equals("sunday");
    }
}
