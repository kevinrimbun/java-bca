package latihanJumat.service;

import java.util.ArrayList;
import java.util.List;

import latihanJumat.model.Menu;

public class ImplCashier implements Cashier<Menu, Integer>{
    List<Menu> menuDao = new ArrayList<>();

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
