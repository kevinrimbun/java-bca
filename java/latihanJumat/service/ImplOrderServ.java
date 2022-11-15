package latihanJumat.service;

import java.util.ArrayList;
import java.util.List;

import latihanJumat.model.Order;

public class ImplOrderServ implements OrderService<Order, Integer> {
    List<Order> listOfOrder = new ArrayList<>();
    private Order order = new Order();

    @Override
    public List<Order> findAll() {
        // TODO Auto-generated method stub
        return listOfOrder;
    }

    @Override
    public Order findById(Integer id) {
        // TODO Auto-generated method stub
        return listOfOrder.get(id);
    }

    @Override
    public void save(Order data) {
        // TODO Auto-generated method stub
        listOfOrder.add(data);
    }

    @Override
    public void update(Integer id, Order data) {
        // TODO Auto-generated method stub
        listOfOrder.set(id, data);
        
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        listOfOrder.remove((int)id);
        
    }

    public int getHarga(int id) {
        Order order = this.findById(id);
        // harga = kuan x harga item
        int harga = (order.getKuantitas() * order.getMenu().getHarga());
        order.setTotalHarga(harga);
        return harga;
    }

    public int getTotalHarga() {
        int totalHarga = 0;
        for (Order order : listOfOrder ) {
            totalHarga += order.getTotalHarga();
        }
        return totalHarga;
    }

    public int getTotalPpn(){
        return getTotalHarga() + (getTotalHarga() * 11 / 100);
    }

    @Override
    public void editPesanan(Integer id, Integer amount) {
        // TODO Auto-generated method stub
        order = listOfOrder.get(id);
        order.setKuantitas(amount);
        System.out.println("\nSuccessfully edit your data!");
        
    }
    

    
    
}
