import java.io.FileWriter;
import java.io.IOException;
public class FileW {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\Users\dsingh33\Desktop\documents"); 
            fileWriter.write(22);
            fileWriter.write(8);
            fileWriter.write(57);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();                 
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}