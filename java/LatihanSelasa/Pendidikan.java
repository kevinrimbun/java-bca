package LatihanSelasa;

public class Pendidikan extends Person {
    private String education;

    // Constructor with parameter
    public Pendidikan (String education) {
        this.education = education;
    }

    // Setter dan Getter Value
    public void setEducation(String pendidikan) {
        this.education = pendidikan;
    }

    public String getEducation() {
        return this.education;
    }

    public void getPendidikan() {
        System.out.println("\n--- Riwayat Pendidikan ---");
        System.out.println("Riwayat Pendidikan: " + getEducation());
    }
}
