package LatihanRabu.Polymorphism;

public class Kubus extends Persegi{
    private int sisiKubus;

    public Kubus(){

    }

    public Kubus(int sisiKubus) {
        this.sisiKubus = sisiKubus;
    }

    public void setSisiKubus(int sisiKubus){
        this.sisiKubus = sisiKubus;

    }
    public int getSisiKubus() {
        return this.sisiKubus;
    } 

    // Override dari Class Persegi
    public void sisiPersegi(){
        System.out.println("---Volume Kubus---");
        System.out.println("Sisi Kubus adalah: " + getSisiKubus());
        System.out.println("Volume Kubus adalah: " + Math.pow(getSisiKubus(), 3) + " meter^3");
    }
    

    
}
