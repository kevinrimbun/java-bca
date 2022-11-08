package LatihanSelasa;

import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner; 
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String option, firstName, lastName, domicile, birthYear, education;

    public void chooseOption() {
        System.out.println("--- Biodata ---");
        System.out.println("1. Input Data Pribadi");
        System.out.println("2. Input Data Pendidikan");
        System.out.println("3. Tampilkan Data Diri");
        System.out.println("4. Tampilkan Data Pendidikan");
        System.out.print("Pilihan Anda: ");
        option = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();

        do {
            main.chooseOption();

            switch (main.option) {

                case "1":
                    System.out.println("--- Input Data Pribadi ---");
                    System.out.print("Input Nama Depan Anda: ");
                    main.firstName = main.scanner.nextLine();
                    System.out.print("Input Nama Belakang: ");
                    main.lastName = main.scanner.nextLine();
                    System.out.print("Input Domisili Anda: ");
                    main.domicile = main.scanner.nextLine();
                    System.out.print("Input Tanggal Lahir Anda (YYYY-MM-DD): ");
                    main.birthYear = main.scanner.nextLine();
                    
                    break;

                case "2":
                    System.out.println("--- Input Data Pendidikan ---");
                    System.out.print("Input Riwayat Pendidikan Anda: ");
                    main.education = main.scanner.nextLine();
                    
                    break;

                case "3":
                    System.out.println("Data Pribadi Anda");
                    Person person = new Person(main.firstName, main.lastName, main.domicile, main.birthYear);
                    person.getBiodata();
                    
                    break;

                case "4":
                    System.out.println("Riwayat Pendidikan Anda");
                    Pendidikan pendidikan = new Pendidikan(main.education);
                    pendidikan.getPendidikan();
                    
                    break;

                default:
                System.out.println("Opsi Tidak Tersedia");
                    break;
            }
            System.out.println("Ingin keluar pendataan? input /y jika ingin keluar | /n jika tidak");
            main.option = main.scanner.nextLine();
        } while (main.option.equalsIgnoreCase("/n"));
        
        System.out.println("Terima Kasih telah melakukan pendataan");
    }
}
