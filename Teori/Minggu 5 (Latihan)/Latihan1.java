import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = scanner.nextInt();
            System.out.println("Input 1 accepted");
            int num2 = scanner.nextInt();
            System.out.println("Input 2 accepted");
        } catch (Exception e) {
            System.out.println("Invalid Entry");
        }
    }
}

/*
    What will be displayed on the console window when the following code is executed and the user enters abc123 and 14?
    
    = Akan terjadi exception karena menginput String ke dalam integer. Yang tampil pada console adalah "Invalid Entry" karena pada block catch terdapat sysout "Invalid Entry".
 */