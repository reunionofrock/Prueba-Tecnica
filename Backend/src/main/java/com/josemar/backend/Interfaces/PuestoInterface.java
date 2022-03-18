package com.josemar.backend.Interfaces;

import java.sql.SQLException;
import java.util.List;

public interface PuestoInterface {
    public List obtenerVacunas() throws SQLException, ClassNotFoundException;
}
