package codewise_automation.self_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Red {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/configurations.properties");
        properties.load(fileInputStream);

        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));



    }
}
