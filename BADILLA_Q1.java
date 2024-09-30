import java.util.Scanner;

public class BADILLA_Q1 {

    // Method to calculate payment based on the number of units
    public static double Payment(int Units) {
        return (Units * 1000); // Each unit costs 1000
    }

    // Declare variables to store student information
    static String StudentName;
    static String Course;
    static int CourseCode;
    static int Payment;
    static int Units;

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner information = new Scanner(System.in);

        // Prompt the user for student details
        System.out.println("STUDENT ENROLLMENT FORM");
        System.out.print("Student Name: ");
        StudentName = information.nextLine(); // Read student's name
        System.out.print("Course: ");
        Course = information.nextLine(); // Read course name
        System.out.print("Course Code: ");
        CourseCode = information.nextInt(); // Read course code

        // Loop to ensure units entered are within the limit of 10
        do {
            System.out.print("No. of Units (max 10): ");
            Units = information.nextInt(); // Read the number of units
            if (Units > 10) {
                System.out.println("Units exceeded. Please enter again."); // Error message if units exceed 10
            }
        } while (Units > 10); // Continue asking until a valid number of units is entered

        // Prompt the user for payment amount
        System.out.print("Payment: ");
        Payment = information.nextInt(); // Read payment amount

        // Call the Receipt method to generate and print the receipt
        Receipt();

        // Close the Scanner object to prevent resource leak
        information.close();
    }

    // Method to generate and display the receipt
    private static void Receipt() {
        double totalPayment = Payment(Units); // Calculate total payment based on units
        String remarks;

        // Determine the remarks based on the payment received
        if (Payment == 0) {
            remarks = "No payment has been recorded."; // No payment made
        } else if (Payment == totalPayment) {
            remarks = "Fully Paid"; // Payment matches total amount
        } else {
            remarks = "Partially Paid"; // Payment is less than total amount
        }

        // Print out the receipt with student information and payment details
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("STUDENT RECEIPT");
        System.out.println("Student Name: " + StudentName);
        System.out.println("Course: " + Course);
        System.out.println("Course Code: " + CourseCode);
        System.out.println("Enrollment Fee: P" + totalPayment); // Display total fee
        System.out.println("Payment Received: P" + Payment); // Display payment received
        System.out.println("Remarks: " + remarks); // Display payment status (remarks)
        System.out.println();
    }
}
