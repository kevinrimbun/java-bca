package latihanJumat.model;

public class Menu{
    protected static String menu;
    protected static Integer harga;

    // Constructor
    public Menu(){
        
    }

    public Menu(String menu, Integer harga) {
        Menu.menu = menu;
        Menu.harga = harga;
    }

    public String getMenu() {
        return Menu.menu;
    }

    public void setMenu(String menu) {
        Menu.menu = menu;
    }

    public Integer getHarga() {
        return Menu.harga;
    }

    public void setHarga(Integer harga) {
        Menu.harga = harga;
    }

    @Override
    public String toString() {
        return menu + " - Rp. " + harga + "\n";
    }
}
