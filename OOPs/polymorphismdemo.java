abstract class person{
    String name;
    int id;
    String email;
    person(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    abstract String getRole();
    abstract void getDetails();
    
}
class Student extends person{
    Student(String name, int id, String email) {
        super(name, id, email);
    }
    String getRole() {
        return "Student";
    }

    void getDetails() {
        System.out.println("Role: " + getRole());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}
class Professor extends person {
    Professor(String name, int id, String email) {
        super(name, id, email);
    }
    String getRole() {
        return "Professor";
    }

    void getDetails() {
        System.out.println("Role: " + getRole());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}
class Administrator extends person {

    Administrator(String name, int id, String email) {
        super(name, id, email);
    }

    String getRole() {
        return "Administrator";
    }

    void getDetails() {
        System.out.println("Role: " + getRole());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}
public class polymorphismdemo {
    public static void main(String[] args) {
        person p;
        p = new Student("Akanksha", 101, "akanksha@email.com");
        p.getDetails();
        p = new Professor("Dr. Sharma", 201, "sharma@email.com");
        p.getDetails();
        p = new Administrator("Mr. Verma", 301, "verma@email.com");
        p.getDetails();
    }
}
