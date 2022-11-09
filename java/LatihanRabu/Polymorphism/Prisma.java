package LatihanRabu.Polymorphism;

public class Prisma extends Segitiga {
    private int tinggiPrisma;

    public Prisma(){

    }

    public Prisma (int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public Prisma(int sisiBangun, int alasSegitiga, int tinggiSegitiga) {
        super(sisiBangun, alasSegitiga, tinggiSegitiga);
    }

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }


    public int getTinggiPrisma() {
        return this.tinggiPrisma;
    }
    
    @Override
    public int getTinggiSegitiga() {
        // TODO Auto-generated method stub
        return super.getTinggiSegitiga();
    }
    
    @Override
    public int getLuasSegitiga() {
        // TODO Auto-generated method stub
        return super.getLuasSegitiga();
    }

    public int getVolume(){
        return ( getLuasSegitiga() * this.getTinggiPrisma() );
    }

    public void volume(){
        System.out.println("---Volume Prisma---");
        System.out.println("Volume prisma adalah: " + getVolume() + " meter^3");
    }
}
