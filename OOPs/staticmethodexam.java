class square{
    static int area(int a){
        return a*a;
    }
    static int perimeter(int a){
        return 4*a;
    }
}
public class staticmethodexam {
    public static void main(String[] args) {
        System.out.println("Area of square is: "+square.area(10));
        System.out.println("Perimeter of square is: "+square.perimeter(20));
    }
}
