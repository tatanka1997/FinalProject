import java.io.File;
import java.io.FileWriter;

public class Logger<T> {
    public void log(T data){
        try{
            File file = new File("log.txt");
            if(!file.exists())
                file.createNewFile();
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(data.toString()+"\n");
            fileWriter.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
