package Nedelja5.MastermindLive;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class kombinacijaznakova {
    private int velicina;
    private ArrayList<String> kombinacija;

    // Конструктор који прима величину

    public kombinacijaznakova(int velicina) {
        this.velicina = velicina;
        kombinacija = new ArrayList<>();
    }

    // void setter за комбинацију
    public void setKombinacija() {
        Scanner sc = new Scanner(System.in);
        System.out.println("x ".repeat(velicina));
        kombinacija.clear();

        for (int i = 0; i < velicina; i++) {
            var znak = sc.next();
            kombinacija.add(znak);
            // else{ // “Premature optimization is the root of all evil”
            //     System.out.println("Дозвољена поља: " + Znakovi.dozvoljeniZnakovi);
            //     sc.nextLine();
            //     setKombinacija(); // Рекурзија
            //     return;
            // }
        }

        if (!znakovi.dozvoljeniZnakovi.containsAll(kombinacija)) {
            System.out.println("Dozvoljeni karakteri:");
            System.out.println(znakovi.dozvoljeniZnakovi);
            setKombinacija();
        }
    }

    public ArrayList<String> getKombinacija() {
        return kombinacija;
    }

    // void setRandom за комбинацију
    public void setRandom() {
        kombinacija.clear();
        // random број од 0 до velicina
        for (int i = 0; i < velicina; i++) {
//            var index = (int) (Math.random() * velicina); greska?
            var index = (int) (Math.random() * znakovi.dozvoljeniZnakovi.size());
            kombinacija.add(znakovi.dozvoljeniZnakovi.get(index));
        }
    }

    public boolean isEqual(kombinacijaznakova kz) {
        for (int i = 0; i < this.kombinacija.size(); i++) {
            if (!this.kombinacija.get(i).equals(kz.kombinacija.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        kombinacijaznakova that = (kombinacijaznakova) o;
        return Objects.equals(kombinacija, that.kombinacija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kombinacija);
    }

    public void porediKombinacije(kombinacijaznakova kz) {
        int brojTacnih = 0;
        int broj = 0;
        ArrayList x = new ArrayList<>();
        ArrayList y = new ArrayList<>();

        for (int i = 0; i < this.kombinacija.size(); i++) {
            if (this.kombinacija.get(i).equals(kz.kombinacija.get(i))) {
                brojTacnih++;
            } else {
                x.add(kz.kombinacija.get(i));
                y.add(this.kombinacija.get(i));

//                System.out.println("pr"+x);
//                System.out.println("pr" +y);
            }
        }
        // broj pogodjenih ali na pogresnom mestu
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if (x.get(i).equals(y.get(j))) {
                    x.remove(x.get(i));
                    y.remove(y.get(j));
                    i--;
                    broj++;
                    break;
                }
            }

//                System.out.println("drx"+x);
//                System.out.println("dry"+y);
        }
        System.out.println("# ".repeat(brojTacnih) + "? ".repeat(broj));
    }

}


// ☻ ☻ ☻ ☺

