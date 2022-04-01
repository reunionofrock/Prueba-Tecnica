package com.josemar.backend.Dao;

import com.josemar.backend.Config.Conexion;

import com.josemar.backend.Entities.Login;

import javax.management.Query;
import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LoginDao {
    Conexion conexion = new Conexion();
    Connection cn = DriverManager.getConnection(conexion.stringConnectionUrl(), conexion.getUser(), conexion.getPasswd());
    public LoginDao() throws SQLException {
    }

    public int sigIn(String user, String password) throws SQLException{
        int sesion;
        try {
            ResultSet rs = null;
            ResultSet rs2 = null;
            PreparedStatement ps2;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //cn.setAutoCommit(false);
            String sql1 = "SELECT sesion FROM users WHERE usuario = '"+ user + "' and contrasena = '" + password+"'" ;
            PreparedStatement ps = cn.prepareStatement(sql1);
            rs = ps.executeQuery();
            if(rs.next()){
                sesion = rs.getInt("sesion");
            }else {
                sesion = 2;
            }
            if(sesion == 0){
                String sql2 = "UPDATE users set sesion = 1 WHERE usuario = '"+user+ "' and contrasena = '"+password+"'";
                ps2 = cn.prepareStatement(sql2);
                ps2.executeUpdate();
                //PreparedStatement ps1 = cn.prepareStatement(sql2);
                //rs1 = ps1.executeUpdate();
            }
            //cn.commit();rs'.
            cn.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
            cn.rollback();
            cn.close();
            sesion = 1;
        }
        return sesion;
    }
    public int logout(String user, String password) throws SQLException{
        int sesion;
        try {
            ResultSet rs = null;
            ResultSet rs2 = null;
            PreparedStatement ps2;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //cn.setAutoCommit(false);
            String sql1 = "SELECT sesion FROM users WHERE usuario = '"+ user + "' and contrasena = '" + password+"'" ;
            PreparedStatement ps = cn.prepareStatement(sql1);
            rs = ps.executeQuery();
            if(rs.next()){
                sesion = rs.getInt("sesion");
            }else {
                sesion = 0;
            }
            if(sesion == 1 ){
                String sql2 = "UPDATE users set sesion = 0 WHERE usuario = '"+user+ "' and contrasena = '"+password+"'";
                ps2 = cn.prepareStatement(sql2);
                ps2.executeUpdate();
                //PreparedStatement ps1 = cn.prepareStatement(sql2);
                //rs1 = ps1.executeUpdate();
            }
            //cn.commit();rs'.
            cn.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
            cn.rollback();
            cn.close();
            sesion = 0;
        }
        return sesion;
    }
}
