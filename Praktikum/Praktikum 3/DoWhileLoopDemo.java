public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        // for (int i = 1; i < 6; i++) {
        //     System.out.println("elemen ke-" + i + " = " + arr[i]);
        // }

        // PERBAIKAN
        int i = 0;
        do {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
        } while (++i < 5);
    }
}