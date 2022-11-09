package LatihanRabu.Abstraction.Parent;

import LatihanRabu.Abstraction.Interface.BangunDatar;

public class Lingkaran extends BangunDatar {
    protected static int jari;

    public Lingkaran(){

    }

    public Lingkaran(int jari){
        Lingkaran.jari = jari;
    }

    public void setJari(int jari) {
        Lingkaran.jari = jari;
    }

    public int getJari(){
        return Lingkaran.jari;
    }
    
    public double calcLuas(){
        if (getJari() %7 == 0) {
            return ( 22/7 * Math.pow(getJari(), 2) );
        } else {
            return ( 3.14 * Math.pow(getJari(), 2) );
        } 
    }

    public double calcKeliling(){
        if (getJari() %7 == 0) {
            return 2 * 22/7 * getJari();
        } else {
            return 2 * 3.14 * getJari();
        }
    }

    @Override
    public void bangunDatar() {
        // TODO Auto-generated method stub
        System.out.println("Bangun Lingkaran");
        
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Karakteristik Lingkaran");
        System.out.println("1. Memiliki jumlah sudut 180 derajat");
        System.out.println("2. Memiliki diameter yang membagi lingkaran menjadi 2 sisi seimbang");
        System.out.println("3. Memiliki jari-jari yang menghubungkan titik pusat dengan titik busur lingkaran.");
        
    }

    @Override
    public void luas() {
        // TODO Auto-generated method stub
        System.out.println("Luas Lingkaran: " + calcLuas() + " meter^2");
        
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        System.out.println("Keliling Lingkaran: " + calcKeliling() + " meter");
    }
    
}
