public class Person {
    private String name;
    private int age;
    private Address address;
    public Employer employer;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age, Address address, Employer employer) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employer = employer;
        employer.addPerson(this);
    }

    public void setEmployerFromEmployerClass(Employer employer) {
        this.employer = employer;
        // employer.addPerson(this);
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
        employer.addPerson(this);
    }

    public void printData() {
        System.out.println(this.name + " | " + this.age + " | " + this.address.getAddress());
    }

    public void printEmployerData() {
        employer.printEmployerData();
    }
}
