package com.josemar.backend.Config;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;

public class Conexion {
    private Connection conn = null;

    String host = "LOCALHOST\\DEVELOPMENT:1433;";
    String db = "database=PRUEBA_VACUNAS;";
    String user = "sa";
    String passwd = "1234";

    private void abrir() throws SQLServerException, SQLException, ClassNotFoundException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://" + host + db,user,passwd);
    }

    public ResultSet ejecutarQuery(String sql) throws SQLException, ClassNotFoundException {
        Statement stmt = null;
        ResultSet rs = null;
        abrir();
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        return rs;
    }

    public void cerrar() throws SQLException {
        if(conn != null) conn.close();
    }

    public String stringConnectionUrl() {
        return "jdbc:sqlserver://localhost\\DEVELOPMENT:1433; databaseName=PRUEBA_VACUNAS;";
    }
    public String getUser(){
        return user;
    }

    public String getPasswd(){
        return passwd;
    }
}
