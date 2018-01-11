package com.devopsbuddy.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    /** the application logger **/
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    public static final String LOGIN_VIEW_NAME = "user/login";

    @RequestMapping("/login")
    public String login() {
        logger.debug("LoginController :: login");
        return LOGIN_VIEW_NAME;
    }
}
