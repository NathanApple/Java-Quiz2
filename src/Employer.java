import java.util.List;

public class Employer {
    private String name;
    private String industry;
    public List<Person> persons;

    public Employer(String name, String industry, List<Person> persons) {
        this.name = name;
        this.industry = industry;
        this.persons = persons;
        for (Person person : persons) {
            person.setEmployerFromEmployerClass(this);
        }
    }

    public void viewListPerson() {
        System.out.println("Name | Age | Address");
        for (Person person : persons) {
            person.printData();
        }
    }

    public void printEmployerData() {
        System.out.println("Name:  " + this.name + ", Industry:  " + this.industry);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }
}
