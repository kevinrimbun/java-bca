package latihanJumat;

import java.util.*;

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
        Date date = new Date();
        GregorianCalendar gcalendar = new GregorianCalendar();
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

        // Minuman
        Menu minuman = new Menu("Ice Tea", 5000);
        minumanDao.save(minuman);
        minuman = new Menu("Hot Ginger Drink", 8000);
        minumanDao.save(minuman);
        minuman = new Menu("Coconut Ice", 5000);
        minumanDao.save(minuman);

        // Paket
        Menu paket = new Menu("Mixed Vegetables with Peanut Sauce Dressing and Ice Tea", 15000);
        paketDao.save(paket);
        paket = new Menu("Yellow Rice Cone and Hot Ginger Drink", 23000);
        paketDao.save(paket);
        paket = new Menu("Rice Rolls and Coconut Ice", 17000);
        paketDao.save(paket);

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
                        System.out.println("4. Hapus Pesanan");
                        System.out.println("5. Edit Pesanan");
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
                                        System.out.println( (i+1 ) + ". " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + " x Rp. " + listOfOrders.get(i).getMenu().getHarga() + " = Rp. " + listOfOrders.get(i).getTotalHarga() );
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
                                        System.out.println( (i+1 ) + ". " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + " x Rp. " + listOfOrders.get(i).getMenu().getHarga() + " = Rp. " + listOfOrders.get(i).getTotalHarga() );
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
                                        System.out.println( (i+1 ) + ". " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + " x Rp. " + listOfOrders.get(i).getMenu().getHarga() + " = Rp. " + listOfOrders.get(i).getTotalHarga() );

                                    }
                                    System.out.print("Ingin menambahkan Menu Paket Kembali? (y | n): ");
                                    main.next = Main.scanner.nextLine();
                                }
                                break;

                            case 4:
                                while (main.next.equals("y")) {
                                    System.out.println("\n------ Hapus Pesanan ------");
                                    System.out.println("\n------ Pesanan Anda ------");
                                    List <Order> listOfOrders = orderDaoImpl.findAll();

                                    for (int i = 0; i < listOfOrders.size(); i++) {
                                        orderDaoImpl.getHarga(i);
                                        System.out.println( (i+1 ) + ". " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + " x Rp. " + listOfOrders.get(i).getMenu().getHarga() + " = Rp. " + listOfOrders.get(i).getTotalHarga() );                                    
                                        int totalOrder = 0;
                                        System.out.println(totalOrder += orderDaoImpl.getHarga(i));
                                    }

                                    System.out.print("Input Nomor Menu yang Ingin dihapus: ");
                                    int menuHapus = scanner.nextInt();
                                    scanner.nextLine();
                                    orderDaoImpl.delete(menuHapus-1);
                                    System.out.println("Menu Telah Dihapus!");
                                    System.out.println("--------------------------");
                                    System.out.print("Ingin menghapus Menu Kembali? (y | n): ");
                                    main.next = Main.scanner.nextLine();
                                    
                                    
                                }
                                break;

                                case 5:
                                while (main.next.equals("y")) {
                                    System.out.println("\n------ Edit Pesanan------");
                                    System.out.println("\n------ Pesanan Anda ------");
                                    List <Order> listOfOrders = orderDaoImpl.findAll();

                                    for (int i = 0; i < listOfOrders.size(); i++) {
                                        orderDaoImpl.getHarga(i);
                                        System.out.println( (i+1 ) + ". " + listOfOrders.get(i).getMenu()
                                        + "\t" + listOfOrders.get(i).getKuantitas() + " x Rp. " + listOfOrders.get(i).getMenu().getHarga() + " = Rp. " + listOfOrders.get(i).getTotalHarga() );                                    
                                        int totalOrder = 0;
                                        System.out.println(totalOrder += orderDaoImpl.getHarga(i));
                                    }

                                    System.out.print("Input Nomor Menu yang Ingin diubah: ");
                                    int menuEdit = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Input Kuantitas yang diinginkan: ");
                                    int menuEdit2 = scanner.nextInt();
                                    scanner.nextLine();

                                    order = new Order();
                                    orderDaoImpl.editPesanan(menuEdit -1, menuEdit2);
                                    System.out.println("Menu Telah Diedit!");
                                    System.out.println("--------------------------");
                                    System.out.print("Ingin mengedit Menu Paket Kembali? (y | n): ");
                                    main.next = Main.scanner.nextLine();
                                    
                                    
                                }
                                break;

                            default:
                            System.out.println("Opsi tidak tersedia");
                            break;
                        }
                    }
                    break;
                    
                    case 3:
                        while (main.next.equals("y")) {
                            System.out.println("\n------ Lakukan Pembayaran ------");
                            System.out.println("\n------ Pesanan Anda ------");
                            System.out.println("");
                            List <Order> listOfOrders = orderDaoImpl.findAll();
                        
                            // int Total = 0;
                            for (int i = 0; i < listOfOrders.size(); i++) {
    
                                orderDaoImpl.getHarga(i);
                                // listOfOrders.get(i).
                                System.out.println( (i+1 ) + ". " + listOfOrders.get(i).getMenu()
                                + "\t" + listOfOrders.get(i).getKuantitas() + " x Rp. " + listOfOrders.get(i).getMenu().getHarga() + " = Rp. " + listOfOrders.get(i).getTotalHarga() );
                                
                            }
                            System.out.println("\n--------------------");
                            System.out.println("\nHarga yg harus dibayarkan (PPN 11%) = " + orderDaoImpl.getTotalPpn()  );

                            System.out.print("Bayar pesanan anda: ");
                            int amount = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            if (amount < orderDaoImpl.getTotalPpn()) {
                                System.out.println("Uang Anda Kurang!");
                            } else {
                                System.out.println("\n------ Struk Pesanan Restoran Wareg ---------");
                                System.out.printf("%s %tB %<te, %<tY", "Tanggal pemesanan:", date);
                                System.out.println("");
                                System.out.print("Waktu pemesanan: ");
                                System.out.print(gcalendar.get(Calendar.HOUR) + " : ");
                                System.out.print(gcalendar.get(Calendar.MINUTE) + " : ");
                                System.out.println(gcalendar.get(Calendar.SECOND) + " WIB ");
                                System.out.println("\n");
                                List <Order> listOrders = orderDaoImpl.findAll();
                                System.out.println("\n--------------------");
                                
                                for (int i = 0; i < listOrders.size(); i++) {
                                    
                                    orderDaoImpl.getHarga(i);
                                    // listOrders.get(i).
                                    System.out.println( (i+1 ) + ". " + listOrders.get(i).getMenu()
                                    + "\t" + listOrders.get(i).getKuantitas() + " x Rp. " + listOrders.get(i).getMenu().getHarga() + " = Rp. " + listOrders.get(i).getTotalHarga() );
                                    
                                }
                                System.out.println("---------------------------------------------");
                                System.out.println("\nTotal Harga (PPN 11%): Rp. " + orderDaoImpl.getTotalPpn());
                                System.out.println("Tunai: Rp. " + amount);

                                System.out.println( "\nKembalian anda: Rp. " +  (amount - orderDaoImpl.getTotalPpn()));
                                System.out.println("Terima Kasih Telah Memesan, Selamat Wareg!");
                                System.out.println("---------------------------------------------");
                                System.out.println("Restoran Wareg x BCA x Fazztrack");
                            }
                            break;
                            
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
