package main.MyWeb.Controler.HomePages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "/Views/main/main_page/index";
    }

}
