class ownException extends Exception {
    ownException(String msg) {
        super(msg);    }
}
public class testown_Exception {
    public static void main(String[] args) {
        int marks = 200;
        try{
            if(marks > 100) {
                throw new ownException("Marks cannot be greater than 100");
            }
        } 
        catch(ownException e) {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End of the program");
        }
    }
}
