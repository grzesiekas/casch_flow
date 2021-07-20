package apka.controllers;

import apka.database.Database;
import apka.model.Zawody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HauptseiteControllers {


    @Autowired
    Database database;

    @RequestMapping(value = "/hauptseite", method = RequestMethod.GET)
    public String hauptseite() {

        return "hauptseite";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "main";
    }


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String maine() {
        return "redirect:/main";
    }


    @RequestMapping(value = "/Losowanie", method = RequestMethod.GET)
    public String Losowanie(Model model) {
        Zawody zawodys = this.database.findJob();
        model.addAttribute("zawodys", zawodys);
        return "main";
    }



    @RequestMapping(value = "/jednakostka", method = RequestMethod.GET)
    public String jedna() {
        return "hauptseite";
    }



    @RequestMapping(value = "/dwiekostki", method = RequestMethod.GET)
    public String dwiekostki() {
        return "hauptseite";
    }

   @RequestMapping(value = "/aktualizacja", method = RequestMethod.GET)
   public String aktualizacja() {
       return "hauptseite";
   }

    @RequestMapping(value = "/akceptacja", method = RequestMethod.GET)
    public String akkcept() {
        return "redirect:/hauptseite";
    }
}

