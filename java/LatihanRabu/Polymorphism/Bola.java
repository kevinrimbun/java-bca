package LatihanRabu.Polymorphism;

public class Bola extends Lingkaran{
    private int sisiBola;

    public Bola(){

    }

    public Bola(int sisiBola) {
        this.sisiBola = sisiBola;
    }

    public void setSisiBola(int sisiBola){
        this.sisiBola = sisiBola;

    }
    public int getSisiBola() {
        return this.sisiBola;
    } 

    // Override dari Class Lingkaran
    public void sisiLingkaran(){
        System.out.println("---Volume Bola---");
        System.out.println("Sisi Bola adalah: " + getSisiBola());
        if (getSisiBola() %7 == 0) {
            System.out.println("Volume Bola adalah: " + (4/3 * 22/7 * Math.pow(getSisiBola(), 3)) + " meter^3");
        } else {
            System.out.println("Volume Bola adalah: " + (4/3 * 3.14 * Math.pow(getSisiBola(), 3)) + " meter^3");
        }
    }
    
}
