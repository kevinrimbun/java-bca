package LatihanRabu.Abstraction.Child;

import LatihanRabu.Abstraction.Interface.BangunRuang;
import LatihanRabu.Abstraction.Parent.Lingkaran;

public class Bola extends Lingkaran implements BangunRuang {

    public Bola(){
        super(jari);
    }

    
    @Override
    public int getJari() {
        // TODO Auto-generated method stub
        return super.getJari();
    }

    @Override
    public double calcLuas() {
        // TODO Auto-generated method stub
        return super.calcLuas();
    }

    public double calcLuasPermukaan() {
        return (4 * calcLuas());
    }

    public double calcVolume(){
        return (4/3 * calcLuas() * getJari());
    }

    @Override
    public void bangunRuang() {
        // TODO Auto-generated method stub
        System.out.println("Bangun Ruang Bola");
        
    }

    @Override
    public void luasPermukaan() {
        // TODO Auto-generated method stub
        System.out.println("Luas Permukaan Bola: " + calcLuasPermukaan() + " meter^2");
        
    }

    @Override
    public void volume() {
        // TODO Auto-generated method stub
        System.out.println("Volume Bola: " + calcVolume() + " meter^3");
        
    }
    
}
