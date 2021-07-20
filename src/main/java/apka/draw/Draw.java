package apka.draw;

import java.util.Random;

public class Draw {




    public static int einz(String[] args){
        Random r  = new Random();
    int a = r.nextInt(5)+1;
        return a;

    }

    public static int zwei(String[] args){
        Random r  = new Random();
        int a = r.nextInt(11)+1;
        return a;


    }


}
