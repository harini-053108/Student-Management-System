import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. List All Students");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            try {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        service.addStudent();
                        break;

                    case 2:
                        service.viewStudent();
                        break;

                    case 3:
                        service.updateStudent();
                        break;

                    case 4:
                        service.deleteStudent();
                        break;

                    case 5:
                        service.listStudents();
                        break;

                    case 6:
                        System.out.println("Thank you for using Student Management System!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid Choice! Please try again.");
                }

            } catch (Exception e) {

                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input

            }
        }
    }
}