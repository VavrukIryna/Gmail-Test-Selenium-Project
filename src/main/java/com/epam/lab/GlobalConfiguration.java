package com.epam.lab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GlobalConfiguration {

    public static String URL;
    public static String NAME_DRIVER;
    public static String PATH_DRIVER;

    public static void loadProperties() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("src//main//resources//config.properties");
            prop.load(input);
            URL = prop.getProperty("url");
            NAME_DRIVER = prop.getProperty("name.driver");
            PATH_DRIVER = prop.getProperty("path.driver");
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