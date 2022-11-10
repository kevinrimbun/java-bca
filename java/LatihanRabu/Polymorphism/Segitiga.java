package LatihanRabu.Polymorphism;

public class Segitiga {
    protected static int sisi, alas, tinggi;

    public Segitiga(){

    }

    public Segitiga(int sisi, int alas, int tinggi) {
        Segitiga.sisi = sisi;
        Segitiga.alas = alas;
        Segitiga.tinggi = tinggi;
    }

    public void setSisi(int sisi) {
        Segitiga.sisi = sisi;
    }

    public void setAlas(int alas) {
        Segitiga.alas = alas;
    }

    public void setTinggi(int tinggi) {
        Segitiga.tinggi = tinggi;
    }

    public int getSisi() {
        return Segitiga.sisi;
    }

    public int getAlas() {
        return Segitiga.alas;
    }

    public int getTinggi() {
        return Segitiga.tinggi;
    }

    public int calcLuas() {
        return ( ( getAlas() * getTinggi() ) / 2 );
    }

    public double calcKeliling() {
        return ( Math.pow(getSisi(), 3) );
    }

    public void luas() {
        // TODO Auto-generated method stub
        System.out.println("Luas Segitiga: " + calcLuas() + " meter^2");
        
    }

    public void keliling() {
        // TODO Auto-generated method stub
        System.out.println("Keliling segitiga: " + calcKeliling() + " meter");
        
    }
}
