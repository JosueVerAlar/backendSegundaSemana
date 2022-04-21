package semana2.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Hola.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
