import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class filehandle {
    public static void main(String[] args) throws Exception {

        File file= new File("abc.txt");
        // System.out.println(file.exists());
        file.createNewFile();
        FileWriter fw=new FileWriter(file);
        fw.write("my name is ritesh yadav");
        fw.close();
      //  FileReader fr=new FileReader(file);
        // fr.close();



    }
}
