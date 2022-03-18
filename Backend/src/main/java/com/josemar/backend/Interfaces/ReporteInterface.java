package com.josemar.backend.Interfaces;

import java.sql.SQLException;
import java.util.List;

public interface ReporteInterface {
    public List obtenerVacunados() throws SQLException, ClassNotFoundException;
}
