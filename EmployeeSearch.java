// EmployeeSearch.java
import java.util.Scanner;

public class EmployeeSearch {
    public static void main(String[] args) {
        String[] employeeIDs = {"EMP001", "EMP002", "EMP003"};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee ID to search: ");
        String searchID = input.nextLine();

        boolean found = false;

        for (int i = 0; i < employeeIDs.length; i++) {
            switch (employeeIDs[i]) {
                case "EMP001":
                case "EMP002":
                case "EMP003":
                    if (employeeIDs[i].equals(searchID)) {
                        System.out.println("Employee " + searchID + " found at index " + i);
                        found = true;
                    }
                    break;
                default:
                    break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}
