package LatihanRabu.Polymorphism;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String option;
    int sisiBangun, alasSegitiga, tinggiSegitiga;

    public void chooseOption(){
        System.out.println("---Pilih Opsi yg Diinginkan");
        System.out.println("1. Input nilai sisi yang diinginkan");
        System.out.println("2. Tampilkan Luas dan Keliling persegi");
        System.out.println("3. Tampilkan Volume Kubus");
        System.out.println("4. Tampilkan Luas dan Keliling Lingkaran");
        System.out.println("5. Tampilkan Volume bola");
        System.out.println("6. Tampilkan Luas dan Keliling Segitiga");
        System.out.println("7. Tampilkan Volume Prisma");

        System.out.print("Pilihan Anda: ");
        option = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Persegi persegi = new Persegi();
        Kubus kubus = new Kubus();
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();
        Segitiga segitiga = new Segitiga();
        Prisma prisma = new Prisma();

        do {
            main.chooseOption();

            switch (main.option) {
                case "1":
                    System.out.println("\n---Input Nilai Sisi Bangun---");
                    System.out.print("Nilai Sisi Bangun yg ingin dikonversi (Persegi, Lingkaran, Kubus, Bola, Keliling Segitiga): ");
                    main.sisiBangun = main.scanner.nextInt();
                    main.scanner.nextLine();
                    System.out.print("Nilai Alas Bangun (Luas Segitiga): ");
                    main.alasSegitiga = main.scanner.nextInt();
                    main.scanner.nextLine();
                    System.out.print("Nilai Tinggi Bangun (Luas Segitiga): ");
                    main.tinggiSegitiga = main.scanner.nextInt();
                    main.scanner.nextLine();
                    break;

                case "2":
                    System.out.println("\nMenampilkan Luas dan Keliling Persegi");
                    persegi = new Persegi(main.sisiBangun);
                    persegi.sisiPersegi();
                    break;
                
                case "3":
                    System.out.println("\nMenampilkan Volume Kubus");
                    kubus = new Kubus(main.sisiBangun);
                    kubus.sisiPersegi();
                    break;

                case "4":
                    System.out.println("\nMenampilkan Luas dan Keliling Lingkaran");
                    lingkaran = new Lingkaran(main.sisiBangun);
                    lingkaran.sisiLingkaran();
                    break;

                case "5":
                    System.out.println("\nMenampilkan Volume Bola");
                    bola = new Bola(main.sisiBangun);
                    bola.sisiLingkaran();
                    break;
                
                case "6":
                    System.out.println("\nMenampilkan Luas dan Keliling Segitiga");
                    segitiga = new Segitiga(main.sisiBangun, main.alasSegitiga, main.tinggiSegitiga);
                    segitiga.sisiSegitiga();
                    break;
                
                case "7":
                    System.out.println("\nMenampilkan Volume Prisma");
                    prisma = new Prisma(main.alasSegitiga, main.tinggiSegitiga);
                    prisma.sisiSegitiga();
                    break;
            
                default:
                    System.out.println("Opsi Tidak tersedia");
                    break;
            }
            System.out.print("Ingin keluar pendataan? input /y jika ingin keluar | /n jika tidak: ");
            main.option = main.scanner.nextLine();
        } while (main.option.equalsIgnoreCase("/n"));
    }
    
}
