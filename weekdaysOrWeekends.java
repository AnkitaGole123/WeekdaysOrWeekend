import java.util.Scanner;
public class weekdaysOrWeekends {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username ");
        String userName = myObj.next();
         if(userName.equalsIgnoreCase("saturday") || userName.equalsIgnoreCase("sunday")) {
             System.out.println("weekends");
         }
         else{
             System.out.println("week days");
         }
    }
}
