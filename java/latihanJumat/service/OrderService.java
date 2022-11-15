package latihanJumat.service;

import java.util.List;

public interface OrderService<T, K> {
    
    List<T> findAll();

    T findById(K id);
  
    void save(T data);
  
    void update(K id, T data);

    void editPesanan(K id, K amount);
  
    void delete(K id);
}
