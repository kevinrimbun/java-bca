package LatihanRabu.Polymorphism;

public class Prisma extends Segitiga {
    private int alasPrisma, tinggiPrisma;

    public Prisma(){

    }

    public Prisma (int alasPrisma, int tinggiPrisma) {
        this.alasPrisma = alasPrisma;
        this.tinggiPrisma = tinggiPrisma;
    }

    public Prisma(int sisiBangun, int alasSegitiga, int tinggiSegitiga) {
        super(sisiBangun, alasSegitiga, tinggiSegitiga);
    }

    public void setAlasPrisma(int alasPrisma){
        this.alasPrisma = alasPrisma;
    }

    public void setTinggiPrisma(int tinggiPrisma){
        this.tinggiPrisma = tinggiPrisma;
    }

    public int getAlasPrisma() {
        return this.alasPrisma;
    }

    public int getTinggiPrisma() {
        return this.tinggiPrisma;
    }

    // Override Segitiga
    public void sisiSegitiga(){
        System.out.println("---Volume Prisma---");
        System.out.println("Volume prisma adalah: " + ( (getAlasPrisma() * getTinggiPrisma()) / 2 ) + " meter^3");
    }
}
