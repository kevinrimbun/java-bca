package LatihanRabu.Polymorphism;

public class Lingkaran {
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

    public void luas() {
        // TODO Auto-generated method stub
        System.out.println("Luas Lingkaran: " + calcLuas() + " meter^2");
        
    }

    public void keliling() {
        // TODO Auto-generated method stub
        System.out.println("Keliling Lingkaran: " + calcKeliling() + " meter");
    }
}
