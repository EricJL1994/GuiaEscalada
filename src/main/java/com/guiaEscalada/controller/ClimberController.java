package com.guiaEscalada.controller;

import com.guiaEscalada.action.CreateClimber;
import com.guiaEscalada.infrastructure.ClimberRepository;
import com.guiaEscalada.model.Climber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller("ClimberController")
public class ClimberController {

    private final ClimberRepository climberRepository;

    @Autowired
    public ClimberController(ClimberRepository climberRepository) {
        this.climberRepository = climberRepository;
    }


    @RequestMapping(path = "/climbers", method = POST)
//    @ResponseStatus(code = CREATED)
    public String createClimber(@ModelAttribute Climber climber) {
        new CreateClimber(climberRepository).execute(climber);
        return "redirect:/climber?id=" + climber.getId();
    }
    @RequestMapping(path = "/climbers", method = GET)
    public String createClimber() {
        return "registerClimber";
    }

    @RequestMapping(path = "/climber", method = GET)
    public String createClimber(@RequestParam("id")int climberId, Model model){
        model.addAttribute("climber", climberRepository.getOne((long) climberId));
        return "climberProfile";
    }


}
