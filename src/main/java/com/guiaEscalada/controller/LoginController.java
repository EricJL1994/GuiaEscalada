package com.guiaEscalada.controller;

import com.guiaEscalada.action.Login;
import com.guiaEscalada.infrastructure.ClimberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller("LoginController")
public class LoginController {

    private final ClimberRepository climberRepository;

    @Autowired
    public LoginController(ClimberRepository climberRepository) {
        this.climberRepository = climberRepository;
    }

    @RequestMapping(path = "/login", method = GET)
    public String Login() {
        return "login";
    }

    @RequestMapping(path = "/login", method = POST)
    public String Login(HttpSession httpSession,
                        @RequestParam(value = "email") String email,
                        @RequestParam(value = "password") String password) {
        if (new Login(climberRepository).execute(httpSession, email, password)){
            long id = climberRepository.findByEmail(email).getId();
            return "redirect:/climber?id=" + id;
        }
        return "login";
    }
}
