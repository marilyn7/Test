/**
 * Created by Marilyn on 27.01.2017.
 */
package OOP;

import java.util.ArrayList;

public class Korter {

    int mahub;
    ArrayList guests = new ArrayList();
    int vaba;

    public Korter (int mahutab){
        mahub = mahutab;
    }

    public void saabus (String kylaline){
        if (mahub > guests.size()) {
            guests.add(kylaline);
            System.out.println(guests);
        }
        else {
            System.out.println("Maja täis!");
        }
        }
    public void prindiKylalisteArv (){
        System.out.println(guests.size());
    }
    public void prindiPaljuVeelMahub(){
        vaba = mahub - guests.size();
        System.out.println(vaba);
    }
    public void lahkus(String a) {
        guests.remove(a);
    }

    }



