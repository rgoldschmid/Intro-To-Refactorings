package at.ac.fhcampuswien.classes;

public class Utils {

    // TODO: Parameterobjekt einführen
    public void printBirthday(int day, int month, int year) {
        String message = String.format("Birthday: %s.%s.%s", day, month, year);
        System.out.println(message);
    }
}
