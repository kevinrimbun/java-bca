package latihanJumat.model;

// import latihanJumat.model.*;

public class Order {
    private int order;


    public Order(){

    }

    public Order(int order){
        this.order = order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder(){
        return this.order;
    }


    // public String orderMakanan(){
    //     if (getOrder() == 1) {
    //         return makananDao.findById(0);
    //     }
    // }



    // public Order() {
    //     super(menu, harga);
    // }

    // public String getUserMenu(){
    //     return super.getMenu();
    // }

    // public void setUserMenu(){
        
    // }
}
