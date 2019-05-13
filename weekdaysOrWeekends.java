import java.util.*;
public class weekdaysOrWeekends {
    public static void main(String[] args) {
        String days = args[0];
        Set<String> weekDaysSet = new HashSet<>(List.of("monday","tuesday","wednesday","thursday","friday"));
        if(isaBoolean(days)) {
            System.out.println("weekends");
        }
        else if(weekDaysSet.contains(days)){
            System.out.println("week days ");
        }
        else {
            System.out.println("invalid input");
        }
    }

    private static boolean isaBoolean(String days) {
        return days.equalsIgnoreCase("saturday") || days.equalsIgnoreCase("sunday");
    }
}
