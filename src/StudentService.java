import java.util.HashMap;
import java.util.Scanner;

public class StudentService {

    private HashMap<Integer, Student> students = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    // Add Student
    public void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Check if Student ID already exists
        if (students.containsKey(id)) {
            System.out.println("Student ID already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine();

        // Create Student Object
        Student student = new Student(id, name, age, department, marks);

        // Store Student in HashMap
        students.put(id, student);

        System.out.println("Student added successfully!");
    }
    // Display Student Details
    public void viewStudent() {

        System.out.print("Enter Student ID : ");
        int id = scanner.nextInt();

        if (students.containsKey(id)) {
            System.out.println(students.get(id));
        } else {
            System.out.println("Student ID not found!");
        }
    }
    // Update Student Details
    public void updateStudent() {
        System.out.print("Enter Student ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (students.containsKey(id)) {
            Student student = students.get(id);

            System.out.print("Enter New Name (current: " + student.getName() + "): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                student.setName(name);
            }

            System.out.print("Enter New Age (current: " + student.getAge() + "): ");
            String ageInput = scanner.nextLine();
            if (!ageInput.isEmpty()) {
                int age = Integer.parseInt(ageInput);
                student.setAge(age);
            }

            System.out.print("Enter New Department (current: " + student.getDepartment() + "): ");
            String department = scanner.nextLine();
            if (!department.isEmpty()) {
                student.setDepartment(department);
            }

            System.out.print("Enter New Marks (current: " + student.getMarks() + "): ");
            String marksInput = scanner.nextLine();
            if (!marksInput.isEmpty()) {
                double marks = Double.parseDouble(marksInput);
                student.setMarks(marks);
            }

            System.out.println("Student details updated successfully!");
        } else {
            System.out.println("Student ID not found!");
        }
    }
    // Delete Student   
public void deleteStudent() {
        System.out.print("Enter Student ID : ");
        int id = scanner.nextInt();

        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student ID not found!");
        }
    }
    // list all students
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("========== All Students ==========");
            for (Student student : students.values()) {
                System.out.println(student);
                System.out.println("-----------------------------------");
            }
        }
    }
}