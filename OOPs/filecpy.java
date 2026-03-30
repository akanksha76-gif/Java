import java.io.*;
public class filecpy {
    public static void main(String[] args) throws IOException {
        int i = 0;
        FileInputStream fin;
        FileOutputStream fout;
        try{
            fin = new FileInputStream(args[0]);
        }
        catch(Exception e){
            System.out.println(e);
            return;
        }
        try{
            fout = new FileOutputStream(args[1]);
        }
        catch(Exception e){
            System.out.println(e);
            return;
        }
        while(fin.available()!=0){
            i = fin.read();
            fout.write(i);
        }
        fin.close();
        fout.close();
    }
}
