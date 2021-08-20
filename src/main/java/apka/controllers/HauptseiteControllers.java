package apka.controllers;

import apka.database.Database;
import apka.model.Zawody;
import apka.model.view.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HauptseiteControllers {


    @Autowired
    Database database;





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


    @RequestMapping(value = "/hauptseite", method = RequestMethod.GET)
    public String hauptseite() {
        return "hauptseite";
    }






//    @RequestMapping(value = "/zaloguj", method = RequestMethod.GET)
//    public String Losowanie(Model model) {
//        Zawody zawodys = this.database.findJob();
//        model.addAttribute("zawodys", zawodys);
//        return "main";
//    }
//
//    @RequestMapping(value = "/zaloguj", method = RequestMethod.POST)
//    public String nazwagracza(@RequestParam String Nazwagracza){
//        return "main";
//    }

}

