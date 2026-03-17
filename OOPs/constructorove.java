class add{
    void add(int a){
        System.out.println(a);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
public class constructorove{
    public static void main(String[] args) {
        add ob = new add();
        ob.add(5);
        ob.add(5, 10);
        ob.add(5, 10, 15);
    }
}