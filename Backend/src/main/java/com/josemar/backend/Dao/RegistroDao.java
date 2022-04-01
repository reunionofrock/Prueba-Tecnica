package com.josemar.backend.Dao;

import com.josemar.backend.Config.Conexion;
import com.josemar.backend.Entities.Registro;

import java.sql.*;

public class RegistroDao {
    Conexion conexion = new Conexion();
    Connection cn = DriverManager.getConnection(conexion.stringConnectionUrl(), conexion.getUser(), conexion.getPasswd());

    public RegistroDao() throws SQLException{

    }


   public String registroUsuario(Registro registro) throws SQLException {
       String response = "";
        String nombre = "";
        String nickName = "";
        String emailUser = "";
        String password = "";

        if(registro.getNombreUser().length()>0 && registro.getNombreUser()!=null){
            nombre = registro.getNombreUser();
        }else{
            nombre = "";
        }
        if(registro.getNickNameUser().length()>0 && registro.getNickNameUser()!=null){
            nickName = registro.getNickNameUser();
        }else{
            nickName = "";
        }
        if(registro.getEmailUser().length()>0 && registro.getEmailUser()!=null){
            emailUser = registro.getEmailUser();
        }else{
            emailUser = "";
        }
        if(registro.getPasswordUser().length()>0 && registro.getPasswordUser()!=null){
            password = registro.getPasswordUser();
        }else{
            password = "";
        }
        if(nombre.length()>0 && nickName.length()>0 && emailUser.length()>0 && password.length()>0){
            try{
                ResultSet rs = null;
                String sql = "SELECT *FROM users WHERE email = '"+ emailUser+"'";
                PreparedStatement ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs!=null && rs.getRow() != 0 ){
                    response = "1";
                }else{
                    int sesion = 0;
                    String sql1 = "INSERT INTO users (nombre, usuario, email, contrasena, sesion) VALUES ('"+nombre+"','"+nickName+"','"+emailUser+"','"+password+"', 0)";
                    PreparedStatement ps2 = cn.prepareStatement(sql1);
                    ps2.executeUpdate();
                    response = "0";
                }
                cn.commit();
                cn.close();
            }catch(Exception e){
                System.out.println(e.toString());
                cn.close();
            }
        }
        return response;
    }
}
