package latihanKamis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import latihanKamis.service.Person;
import latihanKamis.service.Student;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String option, firstName, lastName, domicile, roomStudent;
    int cardId, sks, mataKuliah;

    public void chooseOption(){
        System.out.println("--- Sistem Akademik Universitas Mengoding ---");
        System.out.println("Silahkan Memilih Opsi Pendaftaran");
        System.out.println("1. Input Data Mahasiswa");
        System.out.println("2. Pilih Mata Kuliah");
        System.out.println("3. Tampilkan status mahasiswa anda");


        System.out.print("Pilihan Anda: ");
        option = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        Student student = new Student();
        List<Object> status = new ArrayList<>();

        do {
            main.chooseOption();

            switch (main.option) {
                case "1":
                    System.out.println("--- Input data diri anda ---");
                    System.out.print("1. Input Nama Depan Anda: ");
                    status.add(main.firstName = main.scanner.nextLine()); 
                    System.out.print("2. Input Nama Belakang Anda: ");
                    status.add(main.lastName = main.scanner.nextLine()); 
                    System.out.print("3. Input Domisili Anda: ");
                    status.add(main.domicile = main.scanner.nextLine());
                    System.out.print("4. Input ID Mahasiswa Anda: ");
                    status.add(main.cardId = main.scanner.nextInt());
                    main.scanner.nextLine();
                    person = new Person(main.firstName, main.lastName, main.domicile,main.cardId);

                    break;

                case "2":
                    System.out.println("--- Pilih Mata Kuliah ---");
                    System.out.println("1. Java (75 SKS)");
                    System.out.println("2. JavaScript (65 SKS)");
                    System.out.println("3. Python (55 SKS)");

                    System.out.print("Pilihan Mata Kuliah: ");
                    status.add(main.mataKuliah = main.scanner.nextInt());
                    main.scanner.nextLine();
                    
                    System.out.print("Input jumlah SKS: ");
                    status.add(main.sks = main.scanner.nextInt());
                    main.scanner.nextLine();
                    
                    System.out.print("Input ruangan: ");
                    status.add(main.roomStudent = main.scanner.nextLine());
                    student = new Student(main.sks, main.mataKuliah, main.roomStudent);
                    
                    break;
                
                case "3":
                    System.out.println("--- Status Kemahasiswaan ---");
                    System.out.println(status);
                    person.fullName();
                    person.cardIdentitas();
                    person.domicile();
                    student.courseName();
                    student.sks();
                    student.room();
                    if (main.mataKuliah == 1) {
                        System.out.println(person.getFullName() + " ST ");
                    } else if (main.mataKuliah == 2) {
                        System.out.println(person.getFullName() + " belum mencapai 144 SKS ");
                    } else if (main.mataKuliah == 3) {
                        System.out.println(person.getFullName() + " belum mencapai 144 SKS ");
                    }


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
