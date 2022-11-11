package latihanKamis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import latihanKamis.service.Person;
import latihanKamis.service.Student;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String option, firstName, lastName, domicile, roomStudent;
    int cardId, sks;

    public void chooseOption(){
        System.out.println("--- Sistem Akademik Universitas Mengoding ---");
        System.out.println("Silahkan Memilih Opsi Pendaftaran");
        System.out.println("1. Input Data Diri");
        System.out.println("2. Pilih Mata Kuliah");
        System.out.println("3. Tampilkan status mahasiswa anda");


        System.out.print("Pilihan Anda: ");
        option = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        Student student = new Student();
        List<String> nama = new ArrayList<>();

        do {
            main.chooseOption();

            switch (main.option) {
                case "1":
                    System.out.println("--- Input data diri anda ---");
                    System.out.print("1. Input Nama Depan Anda: ");
                    main.firstName = main.scanner.nextLine(); 
                    System.out.print("2. Input Nama Belakang Anda: ");
                    main.lastName = main.scanner.nextLine(); 
                    System.out.print("3. Input Domisili Anda: ");
                    main.domicile = main.scanner.nextLine();
                    System.out.print("3. Input ID Mahasiswa Anda: ");
                    main.cardId = main.scanner.nextInt();
                    main.scanner.nextLine();
                    person = new Person(main.firstName, main.lastName, main.domicile,main.cardId);

                    break;

                case "2":
                    System.out.println("--- Pilih Mata Kuliah ---");
                    System.out.println("1. Java (75 SKS)");
                    System.out.println("2. JavaScript (65 SKS)");
                    System.out.println("3. Python (55 SKS)");
                    student = new Student(main.sks, main.roomStudent);
                    main.sks = main.scanner.nextInt();
                    main.scanner.nextLine();

                    break;
                
                case "3":
                    System.out.println("--- Status Kemahasiswaan ---");
                    person.fullName();
                    person.cardIdentitas();
                    person.domicile();
                    student.sks();
                    student.room();
                    if (main.sks == 1) {
                        System.out.println(person.getFullName() + " ST dan ruang belajar anda berada di ");
                    } else if (main.sks == 2) {
                        System.out.println(person.getFullName() + " belum mencapai 144 SKS dan ruang belajar anda berada di ");
                    } else if (main.sks == 3) {
                        System.out.println(person.getFullName() + " belum mencapai 144 SKS dan ruang belajar anda berada di ");
                    }

                    break;

                case "4":

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
