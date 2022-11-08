package LatihanSenin;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("\n---Soal No.3---");
        int[] array = {3,2,4,1,5};
        // Arrays.sort(array);
        System.out.println("Urutan dari data array diatas adalah:");
        int index = -1;
        for(int i = 0; i < array.length; i++) {
            index = i;
            for(int j = i; j <= array.length-1 ; j++) {
                if (array[j] < array[index]) {
                    index =j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            
        } for(int i = 0; i <array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
