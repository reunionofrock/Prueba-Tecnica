package com.josemar.backend.Controllers;

import com.josemar.backend.Dao.PuestoDao;
import com.josemar.backend.Dao.ReporteDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReportePuesto {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/reporte-puesto")
    public List obtenerPuestos() throws SQLException, ClassNotFoundException {
        PuestoDao rv = new PuestoDao();
        return rv.obtenerPuesto();
    }
}
