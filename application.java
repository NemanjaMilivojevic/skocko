package Nedelja5.MastermindLive;

public class application {
    public static void main(String[] args) {
         var igra = new skocko(5); // ...

         while(!igra.jeGotova()){
             igra.pokusaj();
         }
    }
}
