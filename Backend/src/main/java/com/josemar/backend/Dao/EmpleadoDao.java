package com.josemar.backend.Dao;

import com.josemar.backend.Interfaces.EmpleadoInterface;
import com.josemar.backend.Config.Conexion;
import com.josemar.backend.Entities.Empleado;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class EmpleadoDao implements EmpleadoInterface {
    Conexion conexion = new Conexion();
    Connection cn = DriverManager.getConnection(conexion.stringConnectionUrl(), conexion.getUser(), conexion.getPasswd());

    public EmpleadoDao() throws SQLException {
    }

    @Override
    public Map<Object,Object> guardarEmpleado(Empleado empleado) throws SQLException {
        Map<Object, Object> map = new HashMap<>();
        try {
            ResultSet rs = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn.setAutoCommit(false);

            String sql1 = "INSERT INTO EMPLEADO (NOMBRE,ID_PUESTO)" +
                    "VALUES('" + empleado.getNombreEmpleado() + "'," + empleado.getIdPuesto() + ")";

            String sql = "SELECT TOP 1 id_empleado FROM empleado order by 1 desc";
            PreparedStatement ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                empleado.setIdEmpleado(rs.getInt("id_empleado"));
            }
            else{
                empleado.setIdEmpleado(1);
            }


            String sql2 = "INSERT INTO REPORTE_VACUNAS(" +
                    "ID_EMPLEADO," +
                    "ID_VACUNA," +
                    "FECHA_1DOSIS," +
                    "FECHA_2DOSIS," +
                    "ESTADO_VACUNA)" +
                    "VALUES (" + empleado.getIdEmpleado() + "," +
                    empleado.getIdVacuna() + "," +
                    "'" + empleado.getFechaPrimerDosis() + "'," +
                    "'" + empleado.getFechaSegundaDosis() + "'," +
                    empleado.getEstadoVacuna() + ")";

            PreparedStatement ps1 = cn.prepareStatement(sql1);
            ps1.executeUpdate();
            PreparedStatement ps2 = cn.prepareStatement(sql2);
            ps2.executeUpdate();

            cn.commit();
            cn.close();
            map.put("msj", "Empleado almacenado correctamente");

        }
        catch(Exception e){
            System.out.println(e.toString());
            cn.rollback();
            cn.close();
            map.put("Error", "Ha ocurrido un error en la inserción");
        }
        return map;
    }
}
