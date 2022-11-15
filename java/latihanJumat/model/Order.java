package latihanJumat.model;

// import latihanJumat.model.*;

public class Order {
    private int kuantitas, totalHarga;
    private Menu menu;

    public Order() {

    }

    public Order(int kuantitas, Menu menu) {
        this.kuantitas = kuantitas;
        this.menu = menu;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
























    // public int getOrder() {
    //     return order;
    // }

    // public void setOrder(int order) {
    //     this.order = order;
    // }

    // public int getTotalHarga() {
    //     return totalHarga;
    // }

    // public void setTotalHarga(int totalHarga) {
    //     this.totalHarga = totalHarga;
    // }

    // @Override
    // public Integer getHarga() {
    //     // TODO Auto-generated method stub
    //     return super.getHarga();
    // }

    // @Override
    // public String getMenu() {
    //     // TODO Auto-generated method stub
    //     return super.getMenu();
    // }

    // @Override
    // public void setHarga(Integer harga) {
    //     // TODO Auto-generated method stub
    //     super.setHarga(harga);
    // }

    // @Override
    // public void setMenu(String menu) {
    //     // TODO Auto-generated method stub
    //     super.setMenu(menu);
    // }

    
}
