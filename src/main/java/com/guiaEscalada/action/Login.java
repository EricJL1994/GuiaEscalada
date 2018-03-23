package com.guiaEscalada.action;

import com.guiaEscalada.infrastructure.ClimberRepository;
import com.guiaEscalada.model.Climber;

import javax.servlet.http.HttpSession;

public class Login {
    private ClimberRepository climberRepository;

    public Login(ClimberRepository climberRepository){
        this.climberRepository = climberRepository;
    }

    public boolean execute(HttpSession httpSession, String email, String password){
        Climber climber = climberRepository.findByEmail(email);
        if (climber == null) return false;
        if (!climber.isCorrectPassword(password)) return false;
        httpSession.setAttribute("user", climber);
        return true;
    }
}
