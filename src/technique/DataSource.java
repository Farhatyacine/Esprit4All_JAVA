/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author YACINE
 */
public class DataSource {

    String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11202770";
    String login = "sql11202770";
    String password = "hJYa59gtWL";
    private Connection connection;

    private static DataSource instance;

    private DataSource() {
        try {
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
