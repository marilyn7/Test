import java.util.ArrayList;

/**
 * Created by Marilyn on 27.01.2017.
 */
public class Chat {

    String tuba;
    ArrayList tekst = new ArrayList();


    public Chat (String toaNimi) {
        tuba = toaNimi;

    }
        public void sisestaSonum(String a, String b) {
            tekst.add(a);
            tekst.add(b);
            System.out.println(tekst);

        }
        public void prindiKoikSonumidKoosKasutajanimega(){
            for (int i = 0; i < tekst.size() ; i=i+2) {

                System.out.print(tekst.get(i)+": " + tekst.get(i+1));
                System.out.println();
            }
        }

        public void adminKustutabSonumi(String c) {

        int lause = tekst.indexOf(c);  //lause asukoht arraylistis
            tekst.remove(lause);
            tekst.remove(lause-1); //see teeb midagi, et tühjaks ei jääks. vähendab arraylisti pikkust

    }

    public void prindiToaNimi (){
        System.out.println(tuba);
}
        }


