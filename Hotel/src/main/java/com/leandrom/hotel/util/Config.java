package com.leandrom.hotel.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("No se encontró el archivo 'config.properties'.");
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Obtiene el valor de una propiedad del archivo de configuración.
     * @param key La clave de la propiedad (ej. "db.url").
     * @return El valor de la propiedad como String.
     */
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
