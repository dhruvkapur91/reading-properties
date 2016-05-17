package org.gradle;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.util.Iterator;
import java.util.Properties;


public class PropertiesConfigurationExample {


    public static void main(String[] args) throws ConfigurationException {
        Configuration config = new PropertiesConfiguration("org/gradle/configuration.properties");
        usePropertiesMethod(config);
        useKeysMethod(config);
    }

    private static void useKeysMethod(Configuration config) {
        System.out.println("Using keys method:");
        Iterator<String> ddls = config.getKeys("ddl");
        while (ddls.hasNext()) {
            String colorValue = ddls.next();
            System.out.println("value for " + colorValue + " " + config.getString(colorValue));
        }
    }

    private static void usePropertiesMethod(Configuration config) {
        System.out.println("Using properties methods");
        Properties allDllProperties = config.getProperties("allDllProperties");
        for (Object o : allDllProperties.keySet()) {
            System.out.println(o + " ---> " + allDllProperties.get(o));
        }
    }
}
