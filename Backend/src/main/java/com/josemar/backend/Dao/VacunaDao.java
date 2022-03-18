package com.josemar.backend.Dao;

import com.josemar.backend.Config.Conexion;
import com.josemar.backend.Entities.Vacuna;
import com.josemar.backend.Interfaces.VacunaInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VacunaDao implements VacunaInterface {

    @Override
    public List obtenerVacunas() throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        List<Vacuna> lstVacunas = new ArrayList<>();
        String sql = "select * from vacuna";

        Conexion conexion = new Conexion();

        rs = conexion.ejecutarQuery(sql);
        while(rs.next()){
            Vacuna vacuna = new Vacuna();
            vacuna.setIdVacuna(rs.getInt("id_vacuna"));
            vacuna.setNombreVacuna(rs.getString("nombre_vacuna"));
            vacuna.setDiasPostPrimerDosis(rs.getInt("dias_post_primera_dosis"));
            vacuna.setDosisUnica(rs.getInt("dosis_unica"));
            lstVacunas.add(vacuna);
        }

        return lstVacunas;
    }
}
