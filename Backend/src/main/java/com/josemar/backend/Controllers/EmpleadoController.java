package com.josemar.backend.Controllers;

import com.josemar.backend.Dao.EmpleadoDao;
import com.josemar.backend.Entities.Empleado;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/guardar-empleado")
    public Map<Object,Object> guardarEmpleado(@RequestBody Empleado empleado) throws SQLException, ClassNotFoundException {
        EmpleadoDao empleadoDao = new EmpleadoDao();
        return empleadoDao.guardarEmpleado(empleado);
    }
}
