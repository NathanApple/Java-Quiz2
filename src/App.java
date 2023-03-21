import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person("Nathan1", 1, new Address("Kalideres", "Jakarta Barat", "Jakarta Raya"));
        Person p2 = new Person("Nathan2", 2, new Address("Kalideres", "Jakarta Timur", "Jakarta Raya"));
        Person p3 = new Person("Nathan3", 3, new Address("Kalideres", "Jakarta Barat", "Jakarta Raya"));
        Person p4 = new Person("Nathan4", 4, new Address("Kalideres", "Jakarta Barat", "Jakarta Raya"));
        Person p5 = new Person("Nathan5", 5, new Address("Kalideres", "Jakarta Barat", "Jakarta Raya"));

        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        Employer employer = new Employer("TEST", "BINUS", persons);

        System.out.println("\nInitial Data");
        employer.viewListPerson();

        System.out.println("\nGet Person Employer Data from employer's person list");
        employer.persons.get(1).printEmployerData();

        System.out.println("\nGet Person Employer Data from person list");
        persons.get(2).printEmployerData();

        Person p6 = new Person("Declare with employer", 5, new Address("Kali", "JKT", "Raya"), employer);
        Person p7 = new Person("Set employer after declare", 5, new Address("Kali", "JKT", "Raya"));
        p7.setEmployer(employer);

        System.out.println("\nUpdated Data");
        employer.viewListPerson();

    }
}
