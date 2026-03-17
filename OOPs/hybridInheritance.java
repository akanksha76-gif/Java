abstract class shape{
    abstract void draw();
}
interface colorable {
    void color();
}

interface scalable{
    void scale();
}

class circle extends shape implements colorable, scalable{
    void draw(){
        System.out.println("Drawing Circle");
    }
    public void color(){
        System.out.println("Coloring Circle");
    }
    public void scale(){
        System.out.println("Scaling Circle");
    }
}
public class hybridInheritance {
    public static void main(String[] args) {
        circle c = new circle();
        c.draw();
        c.color();
        c.scale();
    }
}