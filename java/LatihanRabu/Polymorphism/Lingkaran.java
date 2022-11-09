package LatihanRabu.Polymorphism;

public class Lingkaran {
    private int jariLingkaran;

    public Lingkaran(){

    }

    public Lingkaran (int sisiLingkaran) {
        this.jariLingkaran = sisiLingkaran;
    }

    public void setSisiLingkaran(int sisiLingkaran){
        this.jariLingkaran = sisiLingkaran;
    }

    public int getSisiLingkaran() {
        return this.jariLingkaran;
    }

    public void sisiLingkaran(){
        System.out.println("---Luas dan Keliling Lingkaran---");
        System.out.println("Sisi Lingkaran Adalah: " + getSisiLingkaran());
        if (getSisiLingkaran() %7 == 0) {
            System.out.println("Luas Lingkaran: " + (22/7 * Math.pow(getSisiLingkaran(), 2)) + " meter^2" );
            System.out.println("Keliling Lingkaran: " + (2 * 22/7 * getSisiLingkaran()) + " meter");
        } else {
            System.out.println("Luas Lingkaran: " + (3.14 * Math.pow(getSisiLingkaran(), 2)) + " meter^2");
            System.out.println("Keliling Lingkaran: " + (2 * 3.14 * getSisiLingkaran()) + " meter");
        }
    }
}
