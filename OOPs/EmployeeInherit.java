class Employee {
    int id;
    String name;

    // Constructor of Employee class
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

// Manager class inheriting Employee
class Manager extends Employee {
    String department;

    // Constructor of Manager calling Employee constructor
    Manager(int id, String name, String department) {
        super(id, name);   // calling parent constructor
        this.department = department;
    }

    // Overriding display method
    @Override
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class EmployeeInherit {
    public static void main(String[] args) {

        // Creating object of Manager class
        Manager m = new Manager(101, "Akanksha", "IT");

        // Calling overridden method
        m.display();
    }
}
