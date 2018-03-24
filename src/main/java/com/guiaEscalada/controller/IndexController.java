package com.guiaEscalada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

//@RestController("helloController")
@Controller("helloController")
public class IndexController {

    @RequestMapping(path = "/", method = GET)
    //@ResponseBody
    public String hello(Model model) {
        return "index";
    }
}
