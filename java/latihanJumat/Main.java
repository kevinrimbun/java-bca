package latihanJumat;

import java.util.List;
import java.util.Scanner;

import latihanJumat.model.Menu;
import latihanJumat.model.Order;
import latihanJumat.service.MenuService;
import latihanJumat.service.ImplMenuServ;
import latihanJumat.service.ImplOrderServ;

public class Main {
    private static MenuService<Menu, Integer> makananDao;
    private static MenuService<Menu, Integer> minumanDao;
    private static MenuService<Menu, Integer> paketDao;
    private static MenuService<Menu, Integer> orderTotal;
    static Scanner scanner = new Scanner(System.in);
    static Integer menuOption, price;
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
        ImplMenuServ menuDaoimpl = new ImplMenuServ();
        ImplOrderServ orderDaoImpl = new ImplOrderServ();
        Order order;
        // Menu menu = new Menu();

        makananDao = new ImplMenuServ();
        minumanDao = new ImplMenuServ();
        paketDao = new ImplMenuServ();
        orderTotal = new ImplMenuServ();

        // Makanan
        Menu makanan = new Menu("Mixed Vegetables with Peanut Sauce Dressing", 10000);
        makananDao.save(makanan);
        makanan = new Menu("Yellow Rice Cone", 15000);
        makananDao.save(makanan);
        makanan = new Menu("Rice Rolls", 12000);
        makananDao.save(makanan);
        System.out.println(makananDao.findAll());

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
                    menuDaoimpl.setMakanan();
                    System.out.println("\n------ Minuman ------");
                    menuDaoimpl.setMinuman();
                    System.out.println("\n------ Paket ------");
                    menuDaoimpl.setPaket();

                    System.out.print("\nIngin Melakukan Pemesanan?: (y | n): ");
                    main.next = Main.scanner.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    break;
                
                case 2:
                    System.out.println("\n---------- Pemesanan ----------");
                    while (main.next.equals("y")) {
                        System.out.println("\n------ Pesan ------");
                        System.out.println("1. Makanan");
                        System.out.println("2. Minuman");
                        System.out.println("3. Paket");
                        System.out.println("4. Ubah Pesanan");
                        System.out.println("5. Pembayaran");
                        System.out.print("Pilihan Anda: ");
                        int menuPesan = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        switch (menuPesan) {
                            case 1:
                                while (main.next.equals("y")) {                                    
                                    System.out.println("\n------ Makanan ------");
                                    menuDaoimpl.setMakanan();
    
                                    // Input Makanan
                                    System.out.print("Masukkan pesanan makanan anda: ");
                                    int makananOrder = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Masukkan jumlah pesanan makanan anda: ");
                                    int makananKuantitas = scanner.nextInt();
                                    scanner.nextLine();

                                    Menu menu = makananDao.findById(makananOrder -1);
                                    order = new Order();
                                    order.setMenu(menu);

                                    order.setKuantitas(makananKuantitas);
                                    orderDaoImpl.save(order);

                                    System.out.println("\n------ Pesanan Anda ------");

                                    List <Order> listOfOrders = orderDaoImpl.findAll(); 

                                    for (int i = 0; i < listOfOrders.size(); i++) {

                                        orderDaoImpl.getHarga(i);
                                        // listOfOrders.get(i).
                                        System.out.println( (i+1 ) + " " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + "x" + listOfOrders.get(i).getMenu().getHarga() + " = " + listOfOrders.get(i).getTotalHarga() );
                                    }
                                    System.out.print("Ingin menambahkan menu makanan lagi? (y | n): ");
                                    main.next = Main.scanner.nextLine();
                                }
                                break;

                            case 2:
                                while (main.next.equals("y")) {
                                    System.out.println("\n------ Minuman ------");
                                    menuDaoimpl.setMinuman();

                                    // Input Minuman
                                    System.out.print("Masukkan pesanan makanan anda: ");
                                    int minumanOrder = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Masukkan jumlah pesanan makanan anda: ");
                                    int minumanKuantitas = scanner.nextInt();
                                    scanner.nextLine();

                                    Menu menu = minumanDao.findById(minumanOrder -1);
                                    order = new Order();
                                    order.setMenu(menu);

                                    order.setKuantitas(minumanKuantitas);
                                    orderDaoImpl.save(order);

                                    System.out.println("\n------ Pesanan Anda ------");

                                    List <Order> listOfOrders = orderDaoImpl.findAll(); 

                                    for (int i = 0; i < listOfOrders.size(); i++) {

                                        orderDaoImpl.getHarga(i);
                                        // listOfOrders.get(i).
                                        System.out.println( (i+1 ) + " " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + "x" + listOfOrders.get(i).getMenu().getHarga() + " = " + listOfOrders.get(i).getTotalHarga() );
                                    }
                                    System.out.print("Ingin menambahkan menu minuman kembali? (y | n): ");
                                    main.next = Main.scanner.nextLine();
                                }
                                break;

                            case 3:
                                while (main.next.equals("y")) {
                                    System.out.println("\n------ Paket ------");
                                    menuDaoimpl.setPaket();

                                    // Input Paket
                                    System.out.print("Masukkan pesanan makanan anda: ");
                                    int paketOrder = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Masukkan jumlah pesanan makanan anda: ");
                                    int paketKuantitas = scanner.nextInt();
                                    scanner.nextLine();

                                    Menu menu = paketDao.findById(paketOrder -1);
                                    order = new Order();
                                    order.setMenu(menu);

                                    order.setKuantitas(paketKuantitas);
                                    orderDaoImpl.save(order);

                                    System.out.println("\n------ Pesanan Anda ------");
                                    List <Order> listOfOrders = orderDaoImpl.findAll(); 

                                    for (int i = 0; i < listOfOrders.size(); i++) {

                                        orderDaoImpl.getHarga(i);
                                        // listOfOrders.get(i).
                                        System.out.println( (i+1 ) + " " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + "x" + listOfOrders.get(i).getMenu().getHarga() + " = " + listOfOrders.get(i).getTotalHarga() );
                                    }
                                    System.out.print("Ingin menambahkan Menu Paket Kembali? (y | n): ");
                                    main.next = Main.scanner.nextLine();
                                }
                                break;
                        
                            
                            // case 4: 
                            //     while (main.next.equals("y")) {
                            //         System.out.println("\n------ Ubah Pesanan ------");

                            //         System.out.println("Pesanan Anda : " + orderTotal.findAll());

                            //         System.out.print("Pilih pesanan yang ingin diubah: ");
                            //         int ubah = scanner.nextInt();
                            //         scanner.nextLine();
                            //         paket.setTotalPesanan(ubah - 1);

                            //         System.out.println("Pesanan berhasil diubah!");
                            //         System.out.print("Pesanan Anda : " + orderTotal.findAll() + "\n");

                            //         System.out.print("Ingin mengubah menu kembali? (y | n): ");
                            //         main.next = Main.scanner.nextLine();
                            //     }
                            //     break;

                            
                            default:
                            System.out.println("Opsi tidak tersedia");
                            break;
                        }
                    }
                    break;
                    
                    case 3:
                        System.out.println("\n------ Lakukan Pembayaran ------");
                        System.out.println("--------------------------");
                        int a = 0;
                        for (Menu totalPesanan : orderTotal.findAll()) {
                            a++;
                            System.out.println(a + ". " + totalPesanan);
                        }
                        System.out.println("--------------------------");
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
