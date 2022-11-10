package LatihanRabu.Polymorphism;

public class Kubus extends Persegi{
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

    public void volume() {
        // TODO Auto-generated method stub
        System.out.println("Volume Kubus: " + calcVolume() + " meter^3");
    }
    

    
}
