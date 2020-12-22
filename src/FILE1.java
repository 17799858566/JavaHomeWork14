import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FILE1 {
    public static void main(String[] args) throws IOException {
        File out = new File("C:/Users/86159/Desktop/javaOutput.txt");
        if(out.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(out);

        Scanner in = new Scanner(new File("C:/Users/86159/Desktop/input.txt"));
        while(in.hasNext()){
            String s=in.nextLine();
            output.println(s);
        }
        output.close();
        in.close();
    }
}
