import javax.annotation.processing.FilerException;
import java.io.*;

public class Bufferreader {

    public static void main(String[] args)throws Exception
    {


        FileWriter fw=new FileWriter("about.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("MY NAME IS .......");
        bw.close();

        FileReader  fr=new FileReader("abc.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());

        File file=new File("a.txt");
        file.exists();
        FileWriter fwr=new FileWriter(file);





    }
}
