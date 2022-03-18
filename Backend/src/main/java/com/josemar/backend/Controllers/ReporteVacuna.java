package com.josemar.backend.Controllers;

import com.josemar.backend.Dao.ReporteDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/api")
public class ReporteVacuna {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/reporte-vacunados")
    public List obtenerVacunados() throws SQLException, ClassNotFoundException {
        ReporteDao rv = new ReporteDao();
        return rv.obtenerVacunados();
    }
}
