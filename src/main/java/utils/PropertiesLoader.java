package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    private Properties properties;

    public String getApiPropertie(String valor) {
        String filePath = new File("").getAbsolutePath();
        String path = filePath+"/src/test/resources/config/api.properties";
        properties = new Properties();
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Nao foi possivel ler o arquivo api.properties");
        }
        return properties.getProperty(valor);
    }
}
