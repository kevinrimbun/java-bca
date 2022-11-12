package latihanKamisV2.model;

public class Person {
    private String firstName;
    private String lastName;
    private String domicile;


    public Person(){

    }

    public Person(String firstName, String lastName, String domicile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domicile = domicile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lasstName) {
        this.lastName = lasstName;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    
}
