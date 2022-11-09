package LatihanRabu.Polymorphism;

public class Segitiga {
    private int sisiSegitiga, alasSegitiga, tinggiSegitiga;

    public Segitiga(){

    }

    public Segitiga (int sisiSegitiga, int alasSegitiga, int tinggiSegitiga) {
        this.sisiSegitiga = sisiSegitiga;
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public Segitiga(int sisiBangun) {
    }

    public void setAlasSegitiga(int alasSegitiga){
        this.alasSegitiga = alasSegitiga;
    }

    public void setTinggiSegitiga(int tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }
    

    public void setSisiLingkaran(int sisiSegitiga){
        this.sisiSegitiga = sisiSegitiga;
    }

    public int getSisiSegitiga() {
        return this.sisiSegitiga;
    }

    public int getAlasSegitiga() {
        return this.alasSegitiga;
    }

    public int getTinggiSegitiga() {
        return this.tinggiSegitiga;
    }


    public void sisiSegitiga(){
        System.out.println("---Luas dan Keliling Segitiga");
        System.out.println("Luas Segitiga adalah: " + ( getAlasSegitiga() * getTinggiSegitiga() / 2 ) + " meter^2");
        System.out.println("Keliling Segitiga adalah: " + ( Math.pow(getSisiSegitiga(), 3) ) + " meter^2");
    }
}
