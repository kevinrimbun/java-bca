package latihanJumat.service;

import java.util.ArrayList;
import java.util.List;

import latihanJumat.model.Menu;

public class ImplMenuServ implements MenuService<Menu, Integer>{
    List<Menu> menuDao = new ArrayList<>();
    private static MenuService<Menu, Integer> makananDao;
    private static MenuService<Menu, Integer> minumanDao;
    private static MenuService<Menu, Integer> paketDao;
    
    
    public void setMakanan() {
        makananDao = new ImplMenuServ();
        // orderTotal = new ImplCashier();
        
        Menu makanan = new Menu("Mixed Vegetables with Peanut Sauce Dressing", 10000);
        makananDao.save(makanan);
        makanan = new Menu("Yellow Rice Cone", 15000);
        makananDao.save(makanan);
        makanan = new Menu("Rice Rolls", 12000);
        makananDao.save(makanan);
        int i = 0;
        for (Menu makananMenu : makananDao.findAll()) {
            i++;
            System.out.println(i + ". " + makananMenu);
        }
    }

    public void setMinuman() {
        minumanDao = new ImplMenuServ();
        Menu minuman = new Menu("Ice Tea", 5000);
        minumanDao.save(minuman);
        minuman = new Menu("Hot Ginger Drink", 8000);
        minumanDao.save(minuman);
        minuman = new Menu("Coconut Ice", 5000);
        minumanDao.save(minuman);
        int i = 0;
        for (Menu minumanMenu : minumanDao.findAll()) {
            i++;
            System.out.println(i + ". " + minumanMenu);
        }
    }

    public void setPaket() {
        paketDao = new ImplMenuServ();
        Menu paket = new Menu("Mixed Vegetables with Peanut Sauce Dressing and Ice Tea", 15000);
        paketDao.save(paket);
        paket = new Menu("Yellow Rice Cone and Hot Ginger Drink", 23000);
        paketDao.save(paket);
        paket = new Menu("Rice Rolls and Coconut Ice", 17000);
        paketDao.save(paket);
        int i = 0;
        for (Menu paketMenu : paketDao.findAll()) {
            i++;
            System.out.println(i + ". " + paketMenu);
        }
    }

    @Override
    public List<Menu> findAll() {
        // TODO Auto-generated method stub
        return menuDao;
    }

    @Override
    public Menu findById(Integer id) {
        // TODO Auto-generated method stub
        return menuDao.get(id);
    }

    @Override
    public void save(Menu data) {
        // TODO Auto-generated method stub
        menuDao.add(data);
        
    }

    @Override
    public void update(Integer id, Menu data) {
        // TODO Auto-generated method stub
        menuDao.set(id, data);
        
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        menuDao.remove((int) id);
        
    }


    
}
