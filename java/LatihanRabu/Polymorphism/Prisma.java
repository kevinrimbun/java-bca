package LatihanRabu.Polymorphism;

public class Prisma extends Segitiga {
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

    public void volume() {
        // TODO Auto-generated method stub
        System.out.println("Volume Prisma: " + calcVolume() + " meter^3");
        
    }
}
