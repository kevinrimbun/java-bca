package LatihanRabu.Abstraction;

import java.util.Scanner;

import LatihanRabu.Abstraction.Child.Bola;
import LatihanRabu.Abstraction.Child.Kubus;
import LatihanRabu.Abstraction.Child.Prisma;
import LatihanRabu.Abstraction.Parent.Lingkaran;
import LatihanRabu.Abstraction.Parent.Persegi;
import LatihanRabu.Abstraction.Parent.Segitiga;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String option;
    int sisiPersegi, sisiSegitiga, alas, tinggiSegitiga, tinggiPrisma, jari;

    public void chooseOption(){
        System.out.println("--- Pilih Opsi yg Diinginkan ---");
        System.out.println("1. Persegi");
        System.out.println("2. Kubus");
        System.out.println("3. Segitiga");
        System.out.println("4. Prisma");
        System.out.println("5. Lingkaran");
        System.out.println("6. Bola");


        System.out.print("Pilihan Anda: ");
        option = scanner.nextLine();
    }


    public static void main(String[] args) {
        Main main = new Main();
        Persegi persegi = new Persegi();
        Kubus kubus = new Kubus();
        Segitiga segitiga = new Segitiga();
        Prisma prisma =  new Prisma();
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();


        do {
            main.chooseOption();

            switch (main.option) {
                case "1":
                    System.out.println("\n--- Persegi ---");
                    System.out.print("Input Sisi Persegi: ");
                    main.sisiPersegi = main.scanner.nextInt();
                    main.scanner.nextLine();
                    persegi = new Persegi(main.sisiPersegi);
                    persegi.bangunDatar();
                    persegi.karakteristikBangun();
                    persegi.luas();
                    persegi.keliling();
                    break;

                case "2":
                    System.out.println("\n--- Kubus ---");
                    kubus.bangunRuang();
                    kubus.karakteristikBangun();
                    kubus.luasPermukaan();
                    kubus.volume();
                    break;
                
                case "3":
                    System.out.println("\n--- Segitiga ---");
                    System.out.print("Input sisi segitiga: ");
                    main.sisiSegitiga = main.scanner.nextInt();
                    main.scanner.nextLine();
                    System.out.print("Input Alas segitiga: ");
                    main.alas = main.scanner.nextInt();
                    main.scanner.nextLine();
                    System.out.print("Input Tinggi segitiga: ");
                    main.tinggiSegitiga = main.scanner.nextInt();
                    segitiga = new Segitiga(main.sisiSegitiga, main.alas, main.tinggiSegitiga);
                    main.scanner.nextLine();
                    segitiga.bangunDatar();
                    segitiga.karakteristikBangun();
                    segitiga.luas();
                    segitiga.keliling();
                    break;

                case "4":
                    System.out.println("--- Prisma ---");
                    System.out.print("Input tinggi prisma: ");
                    main.tinggiPrisma = main.scanner.nextInt();
                    main.scanner.nextLine();
                    prisma.bangunRuang();
                    prisma.karakteristikBangun();
                    prisma.luasPermukaan();
                    prisma.volume();
                    break;
                
                case "5":
                    System.out.println("\n--- Lingkaran ---");
                    System.out.print("Input jari-jari lingkaran: ");
                    main.jari = main.scanner.nextInt();
                    main.scanner.nextLine();
                    lingkaran = new Lingkaran(main.jari);
                    lingkaran.bangunDatar();
                    lingkaran.karakteristikBangun();
                    lingkaran.luas();
                    lingkaran.keliling();
                    break;

                case "6":
                    System.out.println("\n--- Bola ---");
                    bola.bangunRuang();
                    bola.karakteristikBangun();
                    bola.luasPermukaan();
                    bola.volume();
                    break;
                    

                default:
                    System.out.println("Opsi tidak tersedia");
                    break;
            }
            System.out.print("Ingin keluar pendataan? input /y jika ingin keluar | /n jika tidak: ");
            main.option = main.scanner.nextLine();
            
        } while (main.option.equalsIgnoreCase("/n"));

    }
}
