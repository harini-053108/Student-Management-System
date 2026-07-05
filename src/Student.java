public class Student {

    // Instance variables
    private int id;
    private String name;
    private int age;
    private String department;
    private double marks;

    // Constructor
    public Student(int id, String name, int age, String department, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    // Getters 
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }   
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to display student details
    @Override
    public String toString() {
        return "========== Student Details ==========\n" +
               "Student ID : " + id + 
               "\nName : " + name + 
               "\nAge : " + age + 
               "\nDepartment : " + department + 
               "\nMarks : " + marks;
    }
}
