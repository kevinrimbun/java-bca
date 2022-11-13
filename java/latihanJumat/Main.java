package latihanJumat;

import java.util.Scanner;

import latihanJumat.model.Menu;
import latihanJumat.service.Cashier;
import latihanJumat.service.ImplCashier;

public class Main {
    private static Cashier<Menu, Integer> makananDao;
    private static Cashier<Menu, Integer> minumanDao;
    private static Cashier<Menu, Integer> paketDao;
    static Scanner scanner = new Scanner(System.in);
    static Integer menuOption;
    String next = "y"; 

    public void chooseOption(){
        System.out.println("\n--- Restoran Wareg ---");
        System.out.println("\nSilahkan Memilih Opsi Pemesanan");
        System.out.println("1. Daftar Menu");
        System.out.println("2. Pemesanan");
        System.out.println("3. Pembayaran");

        System.out.print("Pilihan Anda: ");
        menuOption = scanner.nextInt();
        scanner.nextLine();
    }


    
    public static void main(String[] args) {
        Main main = new Main();

        makananDao = new ImplCashier();
        minumanDao = new ImplCashier();
        paketDao = new ImplCashier();

        // Makanan
        Menu makanan = new Menu("Mixed Vegetables with Peanut Sauce Dressing", 10000);
        makananDao.save(makanan);
        makanan = new Menu("Yellow Rice Cone", 15000);
        makananDao.save(makanan);
        makanan = new Menu("Rice Rolls", 12000);
        makananDao.save(makanan);
        // System.out.println(makananDao.findAll());

        // Minuman
        Menu minuman = new Menu("Ice Tea", 5000);
        minumanDao.save(minuman);
        minuman = new Menu("Hot Ginger Drink", 8000);
        minumanDao.save(minuman);
        minuman = new Menu("Coconut Ice", 5000);
        minumanDao.save(minuman);
        // System.out.println(minumanDao.findAll());

        // Paket
        Menu paket = new Menu("Mixed Vegetables with Peanut Sauce Dressing and Ice Tea", 15000);
        paketDao.save(paket);
        paket = new Menu("Yellow Rice Cone and Hot Ginger Drink", 23000);
        paketDao.save(paket);
        paket = new Menu("Rice Rolls and Coconut Ice", 17000);
        paketDao.save(paket);
        // System.out.println(paketDao.findAll());

        do {
            main.chooseOption();

            switch (menuOption) {
                case 1:
                    System.out.println("\n---------- Daftar Menu ----------");

                    System.out.println("\n------ Makanan ------");
                    int i = 0;
                    for (Menu makananMenu : makananDao.findAll()) {
                        i++;
                        System.out.println(i + ". " + makananMenu);
                    }

                    System.out.println("\n------ Minuman ------");
                    int j = 0;
                    for (Menu minumanMenu : minumanDao.findAll()) {
                        j++;
                        System.out.println(j + ". " + minumanMenu);
                    }

                    System.out.println("\n------ Paket ------");
                    int k = 0;
                    for (Menu paketMenu : paketDao.findAll()) {
                        k++;
                        System.out.println(k + ". " + paketMenu);
                    }

                    System.out.print("\nIngin Melakukan Pemesanan?: (y | n): ");
                    main.next = Main.scanner.nextLine();

                    break;
                
                case 2:
                    System.out.println("\n---------- Pemesanan ----------");
                    while (main.next.equals("y")) {
                        System.out.println("\n------ Pesan ------");
                        System.out.println("1. Makanan");
                        System.out.println("2. Minuman");
                        System.out.println("3. Paket");
                        System.out.print("Pilihan Anda: ");
                        int menuPesan = scanner.nextInt();
                        scanner.nextLine();

                        switch (menuPesan) {
                            case 1:
                                System.out.println("\n------ Makanan ------");
                                int l = 0;
                                for (Menu makananMenu : makananDao.findAll()) {
                                    l++;
                                    System.out.println(l + ". " + makananMenu);
                                }
                                // System.out.print("Input pesanan makanan anda: ");
                                // int menuOrder = scanner.nextInt();
                                // scanner.nextLine();

                                // if (menuOrder == 1){
                                //     System.out.println("Makanan kata rizky " + makananDao.findById(0));
                                // }
                                break;
                                
                                // int pesan = scanner.nextInt();
                                // scanner.nextLine();

                            case 2: 
                                System.out.println("\n------ Minuman ------");
                                int m = 0;
                                for (Menu minumanMenu : minumanDao.findAll()) {
                                    m++;
                                    System.out.println(m + ". " + minumanMenu);
                                }
                                break;

                            case 3:
                                System.out.println("\n------ Paket ------");
                                int n = 0;
                                for (Menu paketMenu : paketDao.findAll()) {
                                    n++;
                                    System.out.println(n + ". " + paketMenu);
                                }
                                
                        
                            default:
                                System.out.println("Opsi tidak tersedia");
                                break;
                        }
                        
                    }
                    break;

            
                default:
                    System.out.println("Opsi tidak tersedia");
                    break;
            }

            System.out.print("\nIngin melanjutkan (y | n): ");
            main.next = Main.scanner.nextLine();

        } while ((main.next.equalsIgnoreCase("y")));

    }
}
