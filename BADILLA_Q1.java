import java.util.Scanner;

public class BADILLA_Q1 {
    public static double Payment(int Units) {
        return (Units * 1000);
    }

    static String StudentName;
    static String Course;
    static int CourseCode;
    static int Payment;
    static int Units;

    public static void main(String[] args)  {
        Scanner information = new Scanner(System.in);

        System.out.println("STUDENT ENROLLMENT FORM");
        System.out.print("Student Name: ");
        StudentName = information.nextLine();
        System.out.print("Course: ");
        Course = information.nextLine();
        System.out.print("Course Code: ");
        CourseCode = information.nextInt();

        do {
            System.out.print("No. of Units (max 10): ");
            Units = information.nextInt();
            if (Units > 10) {
                System.out.println("Units exceeded. Please enter again.");
            }
        } while (Units > 10);

        System.out.print("Payment: ");
        Payment = information.nextInt();

        Receipt();

        information.close();
    }

    private static void Receipt() {
        double totalPayment = Payment(Units); // Calculate total payment based on units
        String remarks;

        if (Payment == 0) {
            remarks = "No payment has been recorded.";
        } else if (Payment == totalPayment) {
            remarks = "Fully Paid";
        } else {
            remarks = "Partially Paid";
        }
        
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("STUDENT RECEIPT");
        System.out.println("Student Name: " + StudentName);
        System.out.println("Course: " + Course);
        System.out.println("Course Code: " + CourseCode);
        System.out.println("Enrollment Fee: P" + totalPayment);
        System.out.println("Payment Received: P" + Payment);
        System.out.println("Remarks: " + remarks);
        System.out.println();
    }
}
