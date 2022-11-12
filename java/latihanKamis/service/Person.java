package latihanKamis.service;

import latihanKamis.abstractClass.StudentRegistration;

public class Person implements StudentRegistration {
    protected static String firstName, lastName, domicile;
    protected static int cardId;

    
    
    public Person(){
        
    }
    
    public Person(String firstName, String lastName, String domicile, int cardId) {
        Person.firstName = firstName;
        Person.lastName = lastName;
        Person.domicile = domicile;
        Person.cardId = cardId;
    }
    
    // Setter dan Getter
    public void setFirstName(String firstName) {
        Person.firstName = firstName;
    }
    

    public String getFirstName(){
        return firstName;
    }
    
    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public String getLastName() {
        return lastName ;
    }

    public static void setCardId(int cardId) {
        Person.cardId = cardId;
    }

    public static int getCardId() {
        return cardId;
    }
    
    public static void setDomicile(String domicile) {
        Person.domicile = domicile;
    }
    
    public static String getDomicile() {
        return domicile;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    @Override
    public void fullName() {
        // TODO Auto-generated method stub 
        System.out.println("Nama Lengkap: " + getFullName());
        
    }

    @Override
    public void cardIdentitas() {
        // TODO Auto-generated method stub
        System.out.println("Card Id: " + cardId);
        
    }

    public void domicile() {
        System.out.println("Domisili Anda: " + domicile);
    }
}
