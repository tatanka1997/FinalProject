public abstract class Person {
    protected String SSN;
    protected String Name;
    protected String phoneNumber;
    protected String address;

    // Constructor
    public Person(String SSN, String name, String phoneNumber, String address) {
        this.SSN = SSN;
        Name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
