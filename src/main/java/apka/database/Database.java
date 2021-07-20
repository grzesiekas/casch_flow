package apka.database;

import apka.model.Zawody;
import apka.model.view.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Database {
    private List<Zawody> zawodys = new ArrayList<>();
    private List<User> users = new ArrayList<>();



    public Database() {
        zawodys.add(new Zawody(1,
                "Mechanik",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(2,
                "Dozorca",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(3,
                "Prawnik",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(4,
                "Nauczyciel",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(5,
                "Menadzer",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(5,
                "Pielęgniarka",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(6,
                "Lekarz",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(7,
                "Kierowca",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(8,
                "Inżynier",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(9,
                "Policjant",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(10,
                "Sekretarka",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(11,
                "Pokojówka",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        zawodys.add(new Zawody(12,
                "Pilot",
                2000, 360, 300,
                0, 60, 60,
                50, 450, 0,
                670, 0, 2000,
                110, 1280, 720,
                31000, 0,
                3000, 2000,
                1000));

        users.add(new User("user",15764,"Michał"));
        users.add(new User("user",65874,"Piotrek"));
        users.add(new User("user",69582,"Oskar"));
        users.add(new User("user",45876,"łukasz"));
        users.add(new User("admin",45876,"Tomek"));

    }


    public Zawody findJob() {
        int a = new Random().nextInt(12) + 1;
        for(Zawody job : this.zawodys){
            if(job.getId()==a){
                return job;
            }
        }

          return null;

    }

}
