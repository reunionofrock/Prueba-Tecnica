package com.josemar.backend.Controllers;


import com.josemar.backend.Dao.LoginDao;
import com.josemar.backend.Dao.NumeroGregorianoDao;
import com.josemar.backend.Dao.RecoverDao;
import com.josemar.backend.Dao.RegistroDao;
import com.josemar.backend.Entities.Registro;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/api")
public class OperationsController {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/calculateRomanNumber/{numero}")
    public String calculateRomanNumber(
            @PathVariable ("numero") String numero) throws SQLException {
        NumeroGregorianoDao numeroDao = new NumeroGregorianoDao();
        return numeroDao.calculateRomanNumber(numero);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/user/login/{user}/{password}")
    public int login(
            @PathVariable ("user") String user,
            @PathVariable ("password") String password
            ) throws SQLException {
        LoginDao loginDao = new LoginDao();
        return loginDao.sigIn(user, password);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/user/logout/{user}/{password}")
    public int logout(
            @PathVariable ("user") String user,
            @PathVariable ("password") String password
    ) throws SQLException {
        LoginDao loginDao = new LoginDao();
        return loginDao.logout(user, password);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/user/register")
    public String userRegister(
            @RequestBody Registro registro) throws SQLException {
        RegistroDao registroDao = new RegistroDao();
        return registroDao.registroUsuario(registro);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/user/recover/{email}")
    public String userRecover(
            @PathVariable ("email") String email) throws SQLException {
        RecoverDao recoverDao = new RecoverDao();
        return recoverDao.recoverUsuario(email);
    }
}
