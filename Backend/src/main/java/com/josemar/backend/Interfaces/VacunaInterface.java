package com.josemar.backend.Interfaces;

import java.sql.SQLException;
import java.util.List;

public interface VacunaInterface {
    public List obtenerVacunas() throws SQLException, ClassNotFoundException;
}
