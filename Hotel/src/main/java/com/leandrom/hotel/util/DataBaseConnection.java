package com.leandrom.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    /**
     * Devuelve una nueva conexión a la base de datos.
     *
     * @return Un objeto Connection.
     * @throws SQLException Si ocurre un error de conexión.
     */
    public static Connection getConnection() throws SQLException {
        String url = Config.getProperty("db.url");
        String usuario = Config.getProperty("db.username");
        String contrasena = Config.getProperty("db.password");
        return DriverManager.getConnection(url, usuario, contrasena);
    }
}
