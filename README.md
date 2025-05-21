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
# Task 2 – Employee Search Code (Java)

This Java program implements a user requirement from the SQA assignment:
> "Search for an employee by ID."

## ✅ Features:
- Uses a `for` loop to iterate through employee IDs.
- Uses a `switch` statement to check each ID.
- Displays if the employee was found or not.

## 🚀 How to Run:
1. Save the file as `EmployeeSearch.java`
2. Compile: `javac EmployeeSearch.java`
3. Run: `java EmployeeSearch`

## 🔗 Author:
Uploaded for Software Quality Assurance – Spring 2025 – MEC
