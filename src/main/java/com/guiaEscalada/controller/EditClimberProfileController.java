package com.guiaEscalada.controller;

import com.guiaEscalada.action.CheckIfLogged;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller("EditClimberProfileController")
public class EditClimberProfileController {

    @RequestMapping(path = "/editClimber", method = GET)
    public String editClimberProfile(HttpSession httpSession, Model model){
        if (!new CheckIfLogged().execute(httpSession)) return "redirect:/login";
        model.addAttribute("user", httpSession.getAttribute("user"));
        return "editClimberProfile";
    }
}
