package LatihanSenin;

import java.util.*;

public class Biodata {
    public static void main(String[] args) {

        System.out.println("---Soal No.1---");
        Scanner object = new Scanner(System.in);
       
        System.out.println("Enter Your First Name: ");
        String firstName = object.nextLine();
        System.out.println("Enter Your Last Name: ");
        String lastName = object.nextLine();
        System.out.println("Enter Your Birth Place: ");
        String birthPlace = object.nextLine();
        System.out.println("Enter Your Fav Programming Lang: ");
        String programLangFav = object.nextLine();
        System.out.println("Enter Your Birth Year: ");
        int birthYear = object.nextInt();

        System.out.println(" ");
        System.out.println("---This is your data---");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Place: " + birthPlace);
        System.out.println("Fav Programming Lang: " + programLangFav);
        System.out.println("Birth Year: " + birthYear);
        
        object.close();
        


        

        
    }
}