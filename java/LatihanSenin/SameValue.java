package LatihanSenin;

public class SameValue {
    public static void main(String[] args) {
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
    }
}
