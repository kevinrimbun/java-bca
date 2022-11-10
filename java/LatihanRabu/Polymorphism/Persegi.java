package LatihanRabu.Polymorphism;

public class Persegi {
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


    public void luas() {
        // TODO Auto-generated method stub
        System.out.println("Luas Persegi: " + ( Math.pow(getSisi(), 2)) + " meter^2");
    }
    
    public void keliling() {
        // TODO Auto-generated method stub
        System.out.println("Keliling Persegi: " + ( 4 * getSisi() ) + " meter" );
    }
}
