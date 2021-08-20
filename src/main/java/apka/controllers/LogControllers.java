package apka.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
public class LogControllers {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
