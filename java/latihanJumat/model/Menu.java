package latihanJumat.model;

public class Menu{
    private String menu;
    private Integer harga;
    private Integer totalPesanan;

    // Constructor
    public Menu(){
        
    }

    public Menu(String menu, Integer harga) {
        this.menu = menu;
        this.harga = harga;
    }

    public String getMenu() {
        return this.menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Integer getHarga() {
        return this.harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getTotalPesanan() {
        return totalPesanan;
    }

    public void setTotalPesanan(Integer totalPesanan) {
        this.totalPesanan = totalPesanan;
    }

    @Override
    public String toString() {
        return menu + " - Rp. " + harga + "\n";
    }
}
