package LatihanRabu.Polymorphism;

public class Persegi {
    private int sisiPersegi;
    
    // Default constructor
    public Persegi(){

    }

    // Constructor with parameter
    public Persegi (int sisiPersegi) {
        this.sisiPersegi = sisiPersegi;
    }
    
    public void setSisiPersegi(int sisiPersegi){
        this.sisiPersegi = sisiPersegi;
    }

    public int getSisiPersegi() {
        return this.sisiPersegi;
    } 


    public int getLuasPersegi(){
        return this.sisiPersegi * this.sisiPersegi;
    }

    public int getKelilingPersegi() {
        return 4 * this.sisiPersegi;
    }

    public void sisiPersegi() {
        System.out.println("--- Luas dan Keliling Persegi---");
        System.out.println("Sisi Persegi adalah: " + getSisiPersegi() + " meter");
        System.out.println("Luas Persegi: " + getLuasPersegi() + " meter^2");
        System.out.println("Keliling Persegi: " + getKelilingPersegi() + " meter");
    }
}
