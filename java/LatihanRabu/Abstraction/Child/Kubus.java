package LatihanRabu.Abstraction.Child;

import LatihanRabu.Abstraction.Interface.BangunRuang;
import LatihanRabu.Abstraction.Parent.Persegi;

public class Kubus extends Persegi implements BangunRuang {

    public Kubus () {
        super(sisi);
    }
    

    @Override
    public int getSisi() {
        // TODO Auto-generated method stub
        return super.getSisi();
    }

    public double calcLuasPermukaan() {
        return 6 * (Math.pow(getSisi(), 2) );
    }

    public double calcVolume() {
        return Math.pow(getSisi(), 3);
    }

    @Override
    public void bangunRuang() {
        // TODO Auto-generated method stub
        System.out.println("Gambar Kubus");
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("\nKarakteristik Kubus: ");
        System.out.println("1. Memiliki bidang pembatas berupa bidang datar persegi.");
        System.out.println("2. Memiliki 4 diagonal ruang yang sama panjang.");
        System.out.println("3. Memiliki 8 titik sudut.");
        System.out.println("4. Memiliki 12 rusuk sama panjang.");
        System.out.println("5. Terdiri atas 6 sisi yang sama panjang dan sama besar di setiap sisinya.");
    }

    @Override
    public void luasPermukaan() {
        // TODO Auto-generated method stub
        System.out.println("Luas Permukaan Kubus: " + calcLuasPermukaan() + " meter^2");
        
    }

    @Override
    public void volume() {
        // TODO Auto-generated method stub
        System.out.println("Volume Kubus: " + calcVolume() + " meter^3");
    }
    
}
