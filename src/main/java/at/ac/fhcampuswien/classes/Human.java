package at.ac.fhcampuswien.classes;

public class Human {

    private String name;
    private int age;
    private boolean married;
    private String street;
    private String city;
    private String zip;
    private int monthlySalary;

    // TODO: Extract Class
    private String areaCode;
    private String telephoneNumber;

    // TODO: Konstruktor generieren lassen
    public Human(String name, int age, boolean married, String street, String city, String zip, int monthlySalary) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.monthlySalary = monthlySalary;
    }

    // TODO: Methode extrahieren
    public void printData() {
        // Basic Data
        System.out.println(
                "Name: '" + name + '\'' +
                ", age: " + age +
                ", is married: " + married
        );
        // Details
        System.out.println(
                "street: '" + street + '\'' +
                ", city: '" + city + '\'' +
                ", zip: '" + zip + '\''
        );
    }

    // TODO: Variable inline vs. extrahieren
    public int calcSalaryForMonths(int months) {
        return monthlySalary * months;
    }

    // TODO: Umbennen einer Funktion
    // TODO: Parameter hinzufügen
    public void sayHello() {
        System.out.println("Hello!");
    }

    // TODO: Generate Getter & Setter
}
