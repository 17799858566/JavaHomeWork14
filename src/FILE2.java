import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FILE2 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:/Users/86159/Desktop/input.txt");
        FileOutputStream out = new FileOutputStream("C:/Users/86159/Desktop/javaOutput.txt");
        byte[] bbuf = new byte[1024];
        int hasRead=0;
        while((hasRead=in.read(bbuf))>0){
            out.write(bbuf,0,hasRead);
        }
        in.close();
        out.close();
    }
}
