/*interface Vehicle {
    abstract void start();
}
class car implements Vehicle{
    public void start(){ 
        System.out.println("Vehicle Started");
    }
}
public class interfaceexam {
    public static void main(String[] args) {
        car ob = new car();
        ob.start;
    }
}*/
interface Vehicle {
    default void start() {
        System.out.println("Vehicle Started");
    }
}
public class interfaceexam {
    public static void main(String[] args) {
        Vehicle c = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Vehicle Started");
            }
        };
        c.start();
    }
}
