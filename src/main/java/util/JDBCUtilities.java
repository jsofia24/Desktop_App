/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jsofi
 */
public class JDBCUtilities {
    private static final String UBICACION_BD = "ProyectosConstruccion.db";
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection(url);
 } 
}
