public class swap {
    public static void main(String[] args){
        int a = 10, b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping again: a = " + a + ", b = " + b);
    }
}
