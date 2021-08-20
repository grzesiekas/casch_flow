package apka.controllers;

import apka.database.Database;
import apka.model.view.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.rmi.server.UnicastServerRef;


@Controller
public class RegisterController {
    @Autowired
    Database database;


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(Model model){
        model.addAttribute( "user", new User());
        return "register"; }



    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String rejestrgracza(@ModelAttribute User user){
        this.database.addUser(user);
        return "redirect:/log";
    }
}



