package com.josemar.backend.Dao;

import com.josemar.backend.Config.Conexion;
import com.josemar.backend.Entities.ReporteVacuna;
import com.josemar.backend.Interfaces.ReporteInterface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReporteDao implements ReporteInterface {

    @Override
    public List obtenerVacunados() throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        List<ReporteVacuna> lstReporteVacunas = new ArrayList<>();
        String sql = "SELECT E.NOMBRE [NOMBRE_EMPLEADO]," +
                "   P.NOMBRE_PUESTO," +
                "   V.NOMBRE_VACUNA," +
                "   V.DOSIS_UNICA," +
                "   RP.FECHA_1DOSIS," +
                "   RP.FECHA_2DOSIS," +
                "   RP.ESTADO_VACUNA " +
                "FROM REPORTE_VACUNAS RP " +
                "   INNER JOIN VACUNA V ON (RP.ID_VACUNA = V.ID_VACUNA) " +
                "   INNER JOIN EMPLEADO E ON (RP.ID_EMPLEADO = E.ID_EMPLEADO)" +
                "   INNER JOIN PUESTO P ON (E.ID_PUESTO = P.ID_PUESTO)";

        Conexion conexion = new Conexion();

        rs = conexion.ejecutarQuery(sql);
        while(rs.next()){
            ReporteVacuna vacunado = new ReporteVacuna();
            vacunado.setNombreEmpleado(rs.getString("nombre_empleado"));
            vacunado.setNombrePuesto(rs.getString("nombre_puesto"));
            vacunado.setNombreVacuna(rs.getString("nombre_vacuna"));
            vacunado.setDosisUnica(rs.getInt("dosis_unica"));
            vacunado.setFechaDosis1(rs.getString("fecha_1dosis"));
            vacunado.setFechaDosis2(rs.getString("fecha_2dosis"));
            vacunado.setEstadoVacuna(rs.getInt("estado_vacuna"));
            lstReporteVacunas.add(vacunado);
        }

        return lstReporteVacunas;
    }
}
