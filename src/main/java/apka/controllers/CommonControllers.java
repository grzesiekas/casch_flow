package apka.controllers;
import apka.database.Database;
import apka.model.Zawody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;


@Controller
public class CommonControllers {

    Map<Integer, Object> mapwylosowane = new HashMap<>();

    @Autowired
    Database database;


    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String main(){
        return "log";
    }

    @RequestMapping(value = "/zaloguj", method = RequestMethod.GET)
    public String Losowanie(Model model) {
        Zawody zawodys = this.database.findJob();
        model.addAttribute("zawodys", zawodys);
        mapwylosowane.put(1,zawodys);
        System.out.println(mapwylosowane);

        return "main";
    }

    @RequestMapping(value = "/zaloguj", method = RequestMethod.POST)
    public String nazwagracza(@RequestParam String Nazwagracza){

        return "main";
    }

}
