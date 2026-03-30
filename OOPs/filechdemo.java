import java.io.*;
public class filechdemo {
    public static void main(String[] args) throws IOException {
        Reader input = new FileReader("C:\\Users\\Akanksha Raj\\Desktop\\sample.txt");
        try{
            char c = (char) input.read();
            System.out.println("Data read from the file: " +c+ " ");
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            input.close();
        }
    }
}
