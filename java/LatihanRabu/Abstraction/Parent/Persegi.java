package LatihanRabu.Abstraction.Parent;

import LatihanRabu.Abstraction.Interface.BangunDatar;

public class Persegi extends BangunDatar {
    protected static int sisi;

    public Persegi(){

    }
    
    public Persegi(int sisi){
        Persegi.sisi = sisi;
    }

    public void setSisi(int sisi) {
        Persegi.sisi = sisi;
    }

    public int getSisi(){
        return Persegi.sisi;
    }


    @Override
    public void bangunDatar() {
        // TODO Auto-generated method stub
        System.out.println("Gambar Persegi");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(" *");
            }   System.out.println("");
        }
        
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("\nKarakteristik Persegi");
        System.out.println("1. Memiliki 4 sisi yang sama besar");
        System.out.println("2. Merupakan Bangun datar");
    }

    @Override
    public void luas() {
        // TODO Auto-generated method stub
        System.out.println("Luas Persegi: " + ( Math.pow(getSisi(), 2)) + " meter^2");
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        System.out.println("Keliling Persegi: " + ( 4 * getSisi() ) + " meter" );
    }
    
}
