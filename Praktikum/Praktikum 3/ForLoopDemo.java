public class ForLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        // for (int i = 1; i < 6; i++) {
        //     System.out.println("elemen ke-" + i + " = " + arr[i]);
        // }
        
        // PERBAIKAN
        for(int i = 0; i < 5; i++)
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
    }
}