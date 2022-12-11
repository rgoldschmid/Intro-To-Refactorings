package at.ac.fhcampuswien;

import at.ac.fhcampuswien.classes.Human;
import at.ac.fhcampuswien.classes.Utils;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();

        // Funktion extrahieren
        Human human = new Human("John", 20, true, "Favoritenstraße 226", "Wien", "1100", 2000);
        human.printData();

        // Variablen extrahieren
        System.out.println(human.calcSalaryForMonths(12));

        // Parameterobjekt einführen
        utils.printBirthday(23, 3, 1993);
    }
}