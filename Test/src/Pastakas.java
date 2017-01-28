/**
 * Created by Marilyn on 27.01.2017.
 */

package OOP;

public class Pastakas {

    int tint;
    int kirjutatud;

        public Pastakas (int tindiKogus){
            tint = tindiKogus;

        }

        public void kirjuta (String tekst){
            int count = 0;
            for (int i = 0; i < tekst.length(); i++) {
                char c = tekst.charAt(i); //kõik tähed tuleb üle vaadata
                if (!Character.isSpaceChar(c)){
                    count++;
                }
                if (tint>count){
                    System.out.print(tekst.charAt(i));
                }

            }
            kirjutatud = count;
        }

        public void prindiPaljuTintiAlles (){
            tint = tint - kirjutatud;
            System.out.println(tint);

        }
}
