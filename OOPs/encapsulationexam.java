class student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class encapsulationexam {
    public static void main(String[] args) {
        student std = new student();
        std.setName("Akanksha");
        std.setAge(21);
        System.out.println("Name: " + std.getName());
        System.out.println("Age: " + std.getAge()); 
    }
}
