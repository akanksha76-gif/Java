abstract class cat{
    abstract void sound();
}
//concrete class
class dog extends cat{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class abstractexam {
    public static void main(String[] args) {
        cat ob = new cat(){
            void sound(){
                System.out.println("Meow");
            }
        };
        ob.sound();
        dog ob1 = new dog();
        ob1.sound();
    }
}
