package LatihanSelasa;


public class Person {
    private String firstName, lastName, domicile;
    private int birthYear;

    // Default Constructor without parameter (inisialisai variabel dgn nilai default). num = 0, string = ("")
    public Person(){

    }

    // Constructor with parameter
    public Person (String firstName, String lastName, String domicile, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domicile = domicile;
        this.birthYear = birthYear;
    }

    // Setter and Getter Value
    public void setFirstName(String namaDepan) {
        this.firstName = namaDepan;
    }

    public void setLastName(String namaBelakang) {
        this.lastName = namaBelakang;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setDomicile(String domisili) {
        this.domicile = domisili;
    }

    public String getDomicile() {
        return this.domicile;
    }

    public void setBirthYear(int tahunLahir ) {
        this.birthYear = tahunLahir; 
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    // Calculated Age Static
    public int getAge() {
        return 2022 - this.birthYear;
    }

    public void getBiodata() {
        System.out.println("\n--- Data Pribadi ---");
        System.out.println("Nama Lengkap: " + getFullName());
        System.out.println("Domisili: " + getDomicile());
        System.out.println("Tahun Lahir: " + getBirthYear());
        System.out.println("Umur Anda: " + getAge() + " tahun");
    }

}