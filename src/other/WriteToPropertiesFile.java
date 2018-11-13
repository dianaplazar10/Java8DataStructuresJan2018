package other;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteToPropertiesFile{
    public static int INDEXVALUE=0;
    public static void main(String args[]){
        //System.out.println("Hello "+args[0] +" and " + args[1]);
        while(true){
            Properties prop = new Properties();
            OutputStream output = null;
    
            try {
                output = new FileOutputStream("."+File.separator + "conf"+File.separator + "config.properties");
                prop.setProperty("index", String.valueOf(++INDEXVALUE));
                prop.store(output, "none");
            } catch (Exception io) {
                io.printStackTrace();
            } finally {
                if (output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
    
            }
        }
    }
}