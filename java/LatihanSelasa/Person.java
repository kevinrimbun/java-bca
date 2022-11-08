package LatihanSelasa;

// import java.time.LocalDate;  
// import java.time.Period;

public class Person {
    private String firstName, lastName, domicile, birthYear;

    // Default Constructor without parameter (inisialisai variabel dgn nilai default). num = 0, string = ("")
    public Person(){

    }

    // Constructor with parameter
    public Person (String firstName, String lastName, String domicile, String birthYear) {
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

    public void setBirthYear(String tahunLahir ) {
        this.birthYear = tahunLahir; 
    }

    // LocalDate dob = LocalDate.parse(input);

    public String getAge() {
        return this.birthYear;
    }

    public void getBiodata() {
        System.out.println("--- Data Pribadi ---");
        System.out.println("Nama Lengkap: " + getFullName());
        System.out.println("Domisili: " + getDomicile());
        System.out.println("Birth Year:" + getAge());
    }

}