package com.josemar.backend.Controllers;

import com.josemar.backend.Dao.VacunaDao;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VacunaController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/obtener-vacunas")
    public List obtenerPaises() throws SQLException, ClassNotFoundException {
        VacunaDao vacuna = new VacunaDao();
        return vacuna.obtenerVacunas();
    }
}