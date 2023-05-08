package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperation {

    //object of property file
    Properties prop;

    public String getPropertyFileData(String key) throws IOException {
        //load data first

        prop=new Properties();
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:/Users/ns217/OneDrive/Desktop/Nitu_individual_projecct_11909278/src/main/java/org/example/config.properties");
        prop.load(fis);

        //read data
        String value=prop.get(key).toString();
        return value;

    }
}