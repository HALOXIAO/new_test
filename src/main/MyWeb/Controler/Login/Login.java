package main.MyWeb.Controler.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "Views/Login/login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String name, @RequestParam("password") String pass) {
        return "";
    }
}
