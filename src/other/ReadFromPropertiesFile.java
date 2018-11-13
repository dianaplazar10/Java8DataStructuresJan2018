package other;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromPropertiesFile {

    public static void main(String[] args) {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("."+File.separator + "conf"+File.separator + "config.properties");
            prop.load(input);
            int currentIndex = Integer.parseInt(prop.getProperty("index"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
