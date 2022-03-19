package com.josemar.backend.Dao;

import com.josemar.backend.Config.Conexion;
import com.josemar.backend.Entities.Puesto;
import com.josemar.backend.Interfaces.PuestoInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PuestoDao implements PuestoInterface {
    @Override
    public List obtenerPuesto() throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        List<Puesto> lstPuestos = new ArrayList<>();
        String sql = "SELECT *FROM PUESTO";

        Conexion conexion = new Conexion();

        rs = conexion.ejecutarQuery(sql);
        while(rs.next()){
            Puesto puesto = new Puesto();
            puesto.setIdPuesto(rs.getInt("id_puesto"));
            puesto.setNombre(rs.getString("nombre_puesto"));
            lstPuestos.add(puesto);
        }

        return lstPuestos;
    }
}
