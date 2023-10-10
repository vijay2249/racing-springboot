package com.f1.racing.controller;

import com.f1.racing.service.AuthenticationService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {


    private AuthenticationService authenticationService;
//    private Logger logger = LoggerFactory.getLogger(getClass());

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

//    @RequestMapping("login")
//    public String login(@RequestParam String name,@RequestParam String password,  ModelMap model){
//        model.put("name", name);
//        logger.debug("Request params:: name: {}, password:{}", name, password);
////        System.out.println(name);
//        return "login";
//    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name,@RequestParam String password,ModelMap modal){
        boolean isValidCred = authenticationService.authenticate(name, password);
        if(isValidCred) {
            modal.put("name", name);
            modal.put("password", password);
            return "welcome";
        }
        modal.put("error", "Invalid Credentials");
        return "login";
    }
}
