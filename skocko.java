package Nedelja5.MastermindLive;

public class skocko {
    private int maxBrPokusaja;
    private int brPokusaja;
    private int velicina = 4;
    private kombinacijaznakova trazenaKombinacija;
    private kombinacijaznakova trenutnaKombinacija;



    // Конструктор
    public skocko(int maxBrPokusaja){
        this.maxBrPokusaja = maxBrPokusaja;
        this.brPokusaja = 1;
        this.trenutnaKombinacija = new kombinacijaznakova(velicina);
        this.trazenaKombinacija = new kombinacijaznakova(velicina);
        trazenaKombinacija.setRandom();

    }
    public void pokusaj(){
        // brPokusaja++

        // Унесемо тренутну комбинацију
        System.out.println("Pokusaj broj: " + brPokusaja + " od " + maxBrPokusaja);
        System.out.println("Dozvoljeni karakteri:");
        System.out.println(znakovi.dozvoljeniZnakovi);
        trenutnaKombinacija.setKombinacija();
        brPokusaja++;
        // Испишемо ☺ ☺ ☺
        trenutnaKombinacija.porediKombinacije(trazenaKombinacija);
    }

    public boolean jeGotova(){

//        System.out.println(trazenaKombinacija.getKombinacija());
        // Провера дал је исто
        if(trazenaKombinacija.equals(trenutnaKombinacija)) {
            System.out.println("BRAVO! Pogodili ste trazenu kombinaciju!");
            return true;
        }
        if(brPokusaja > maxBrPokusaja){
            System.out.println("Iskoristili ste maksimalan broj pokusaja! \nTrazena kombinacija je bila: " + trazenaKombinacija.getKombinacija());
            return true;
        }


        return false;
    }
    // boolean isGameOver()
}
