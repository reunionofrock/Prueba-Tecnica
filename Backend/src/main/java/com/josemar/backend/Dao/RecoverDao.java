package com.josemar.backend.Dao;

import com.josemar.backend.Config.Conexion;
import com.josemar.backend.Entities.Registro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RecoverDao {
    Conexion conexion = new Conexion();
    Connection cn = DriverManager.getConnection(conexion.stringConnectionUrl(), conexion.getUser(), conexion.getPasswd());


    public RecoverDao() throws SQLException {

    }

    public String recoverUsuario(String email) throws SQLException {
        String response ="";
        String sql = "SELECT *FROM usersRegistered WHERE email = "+email;

        return response;
    }
}
