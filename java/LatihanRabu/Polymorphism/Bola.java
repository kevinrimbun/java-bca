package LatihanRabu.Polymorphism;

public class Bola extends Lingkaran{
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

    public void volume() {
        // TODO Auto-generated method stub
        System.out.println("Volume Bola: " + calcVolume() + " meter^3");
        
    }
    
}
