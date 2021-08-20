package apka.controllers;


import apka.database.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainControllers {

    @Autowired
    Database database;


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String maine() {

        return "redirect:/main";
    }


    @RequestMapping(value = "/akceptacja", method = RequestMethod.GET)
    public String akkcept(Model model) {


        return "redirect:/hauptseite";
    }


//    @RequestMapping(value = "/akceptacja", method = RequestMethod.POST)
//    public String akkceptpost(@RequestParam String akkceptpost){
//        return "hauptseite";
//    }


}
