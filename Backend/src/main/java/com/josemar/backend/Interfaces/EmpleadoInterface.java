package com.josemar.backend.Interfaces;

import com.josemar.backend.Entities.Empleado;

import java.sql.SQLException;
import java.util.Map;

public interface EmpleadoInterface {
    public Map<Object,Object> guardarEmpleado(Empleado empleado) throws SQLException, ClassNotFoundException;
}
