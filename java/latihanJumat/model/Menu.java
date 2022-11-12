package latihanJumat.model;

import java.util.*;

public class Menu {
    private HashMap<String, Integer> makanan = new HashMap<String, Integer>();
    private HashMap<String, Integer> minuman = new HashMap<String, Integer>();
    private HashMap<String, Integer> paket = new HashMap<String, Integer>();

    
    // Constructor
    public Menu(){
        
    }
    
    public Menu(HashMap<String, Integer> makanan, HashMap<String, Integer> minuman, HashMap<String, Integer> paket) {
        this.makanan = makanan;
        this.minuman = minuman;
        this.paket = paket;
    }
    
    
    // Makanan
    public void setMakanan(HashMap<String, Integer> makanan) {
        this.makanan.put("Mixed Vegetables with Peanut Sauce Dressing", 10000);
        this.makanan.put("Yellow Rice Cone", 15000);
        this.makanan.put("Rice Rolls", 12000);
    }

    public HashMap<String, Integer> getMakanan() {
        return makanan;
    }

    // Minuman
    public void setMinuman(HashMap<String, Integer> minuman) {
        this.minuman.put("Ice Tea", 5000);
        this.minuman.put("Hot Ginger Drink", 8000);
        this.minuman.put("Coconut Ice", 5000);
    }

    public HashMap<String, Integer> getMinuman() {
        return minuman;
    }

    // Paket
    public void setPaket(HashMap<String, Integer> paket) {
        this.paket.put("Mixed Vegetables with Peanut Sauce Dressing and Ice Tea", 15000);
        this.paket.put("Yellow Rice Cone ad Hot Ginger Drink", 23000);
        this.paket.put("Rice Rolls", 17000);

    }

    public HashMap<String, Integer> getPaket() {
        return paket;
    }

}
