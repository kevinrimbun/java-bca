package latihanKamisV2;

import java.util.*;
import latihanKamisV2.service.*;

public class Main {
    Scanner scanner = new Scanner(System.in);
    static Integer menu;
    Integer sks, index;
    String next = "y"; 
    String firstName, lastName, domicile, courseName, room;
    static studentService studentService = new implStudentService();
    

    public void chooseOption(){
        System.out.println("\n--- Sistem Akademik Universitas Mengoding ---");
        System.out.println("Silahkan Memilih Opsi Pendaftaran");
        System.out.println("1. Input Data Mahasiswa");
        System.out.println("2. Input Mata Kuliah");
        System.out.println("3. Tampilkan Semua Data Mahasiswa (Input pada opsi 1 terlebih dahulu!)");
        System.out.println("4. Tampilkan Data KRS Mahasiswa (Input pada opsi 1 dan 2 terlebih dahulu!)");

        System.out.print("Pilihan Anda: ");
        menu = scanner.nextInt();
        scanner.nextLine();
    }


    public static void main(String[] args) {
        Main main = new Main();

        do {
            main.chooseOption();

            switch (menu) {
                case 1:
                while (main.next.equals("y")) {

                    System.out.println("\n---- Input Data Mahasiswa ----");
                    System.out.print("1. Input Nama Depan Anda: ");
                    main.firstName = main.scanner.nextLine(); 
                    System.out.print("2. Input Nama Belakang Anda: ");
                    main.lastName = main.scanner.nextLine(); 
                    System.out.print("3. Input Domisili Anda: ");
                    main.domicile = main.scanner.nextLine();
                    studentService.studentRegistration(main.firstName, main.lastName, main.domicile);

                    System.out.print("\nIngin Menambah Data Mahasiswa? (y | n): ");
                    main.next = main.scanner.nextLine();
                }
                main.next = "y";
                break;
                
                case 2:
                    while (main.next.equals("y")) {
                        System.out.println("\n---- Input Data Mata Kuliah ----");
                        System.out.print("1. Input NIM mahasiswa: ");
                        main.index = main.scanner.nextInt() - 1;
                        main.scanner.nextLine();
                        System.out.print("2. Input Mata Kuliah: ");
                        main.courseName = main.scanner.nextLine(); 
                        System.out.print("3. Input Bobot SKS: ");
                        main.sks = main.scanner.nextInt(); 
                        main.scanner.nextLine();
                        System.out.print("4. Input Ruangan: ");
                        main.room = main.scanner.nextLine();
                        studentService.learningPlan(main.courseName, main.sks, main.room, main.index);
                        System.out.print("Ingin Menambah Data Mahasiswa? (y | n): ");
                        main.next = main.scanner.nextLine();
                    }
                    main.next = "y";
                    break;

                case 3:
                    System.out.println("---- Data Mahasiswa ----");
                    studentService.getStudents();

                    break;

                case 4:
                    while (main.next.equals("y")) {
                        System.out.println("---- Data KRS Mahasiswa ----");
                        System.out.print("Masukkan NIM Mahasiswa: ");
                        main.index = main.scanner.nextInt();
                        main.scanner.nextLine();
                        studentService.getStudent(main.index - 1);
                        System.out.println("Total SKS: " + studentService.getTotalSks(main.index - 1));
                        studentService.getSchedule(main.index - 1);

                        System.out.print("\nIngin Melihat Data KRS Mahasiswa Yg Lain? (y | n): ");
                        main.next = main.scanner.nextLine();
                    }
                    main.next = "y";
                    break;
                    

            
            default:
                System.out.println("Opsi tidak tersedia");
                break;
            }
            System.out.print("\nIngin melanjutkan (y | n): ");
            main.next = main.scanner.nextLine();

        } while ((main.next.equalsIgnoreCase("y")));
    }
}
