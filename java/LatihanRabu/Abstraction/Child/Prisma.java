package LatihanRabu.Abstraction.Child;

import LatihanRabu.Abstraction.Interface.BangunRuang;
import LatihanRabu.Abstraction.Parent.Segitiga;


public class Prisma extends Segitiga implements BangunRuang {

    public Prisma(){
        super(sisi, alas, tinggi);
    }

    @Override
    public int getAlas() {
        // TODO Auto-generated method stub
        return super.getAlas();
    }

    @Override
    public int getSisi() {
        // TODO Auto-generated method stub
        return super.getSisi();
    }

    @Override
    public int getTinggi() {
        // TODO Auto-generated method stub
        return super.getTinggi();
    }

    @Override
    public int calcLuas() {
        // TODO Auto-generated method stub
        return super.calcLuas();
    }

    @Override
    public double calcKeliling() {
        // TODO Auto-generated method stub
        return super.calcKeliling();
    }

    public int calcLuasPermukaan() {
        return ( (2 * calcLuas()) + ( (int) Math.round(calcKeliling()) * tinggi) );
    }

    public int calcVolume() {
        return calcLuas() * tinggi;
    }

    @Override
    public void bangunRuang() {
        // TODO Auto-generated method stub
        System.out.println("Bangun prisma");
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Karakteristik Prisma: ");
        System.out.println("1. mempunyai 5 sisi, 3 sisi di samping yang bentuknya persegi panjang dan 2 sisi alas dan atap yang bentuknya segitiga.");
        System.out.println("2. mempunyai 6 titik sudut. Prisma segitiga mempunyai 9 rusuk, 3 di antara rusuk tersebut adalah rusuk tegak.");
    }

    @Override
    public void luasPermukaan() {
        // TODO Auto-generated method stub
        System.out.println("Luas Permukaan Prisma: " + calcLuasPermukaan() + " meter^2");
        
    }

    @Override
    public void volume() {
        // TODO Auto-generated method stub
        System.out.println("Volume Prisma: " + calcVolume() + " meter^3");
        
    }
    
}
