package LatihanRabu.Abstraction.Parent;

import LatihanRabu.Abstraction.Interface.BangunDatar;

public class Segitiga extends BangunDatar{
    protected static int sisi, alas, tinggi;

    public Segitiga(){

    }

    

    public Segitiga(int sisi, int alas, int tinggi) {
        Segitiga.sisi = sisi;
        Segitiga.alas = alas;
        Segitiga.tinggi = tinggi;
    }

    // public Segitiga(int sisiSegitiga) {
    // }

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


    @Override
    public void bangunDatar() {
        // TODO Auto-generated method stub
        System.out.println("Gambar Segitiga");
        int x = 5;
        for (int i = 1; i <= x; i++){
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            for (int l = 1; l <= i - 1; l++){
                System.out.print('*');
            }
            System.out.println();
        }
        
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Karakteristik Segitiga: ");
        System.out.println("1. Memiliki tiga sudut yang sama besarnya, yakni 60 derajat.");
        System.out.println("2. Memiliki tiga sumbu simetri lipat. Memiliki tiga sumbu simetri putar");
        
    }

    @Override
    public void luas() {
        // TODO Auto-generated method stub
        System.out.println("Luas Segitiga: " + calcLuas() + " meter^2");
        
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        System.out.println("Keliling segitiga: " + calcKeliling() + " meter");
        
    }
    
}
