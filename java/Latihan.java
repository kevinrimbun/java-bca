import java.util.*;

public class Latihan {
    public static void main(String[] args) {

        System.out.println("---Soal No.1---");
        Scanner object = new Scanner(System.in);
        // System.out.println("Enter Your First Name, Last Name, Birth Place,Fav Programming Language, and your Birth Year: ");

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

        System.out.println(" ");
        System.out.println("---Soal No.2---");
        int[] array1 = {2,3,4,5};
        int[] array2 = {1,3,5,7};
        System.out.println("Data yang sama dari array1 dan array2 adalah:");
        
        for(int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j])
                System.out.print(array1[i] + ", ");
            }
        }

        System.out.println(" ");
        System.out.println("\n---Soal No.3---");
        int[] array = {3,2,4,1,5};
        Arrays.sort(array);

        System.out.println("Urutan dari data array diatas adalah:");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }


    }
}