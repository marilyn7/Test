/**
 * Created by Marilyn on 28.01.2017.
 */

package OOP;

import java.util.ArrayList;

public class Kassa {

    String müüja;
    ArrayList tooted = new ArrayList();

    public Kassa (String kassapidaja){
    müüja = kassapidaja;

    }

    public void lisaToode (String toode){
        tooted.add(toode);

    }
    public void eemaldaToode (String toode) {
        tooted.remove(toode);

    }
    public void prindiOstutsekk (){
        System.out.println(tooted);
    }
    public void prindiKassapidajaNimi(){
        System.out.println(müüja);
    }
}
