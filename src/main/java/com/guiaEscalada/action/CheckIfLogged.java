package com.guiaEscalada.action;

import javax.servlet.http.HttpSession;

public class CheckIfLogged {
    public boolean execute(HttpSession httpSession){
        return httpSession.getAttribute("user") != null;
    }
}
