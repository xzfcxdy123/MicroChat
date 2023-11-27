package com.web.microchat.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConfig {

    private static final String URL = "jdbc:mysql://localhost:3306/microchat?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=utf-8";

    private static final String USER = "root";

    private static final String PASSWORD = "123456";

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }

    public static Connection getConnection() {

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return connection;
    }
}
