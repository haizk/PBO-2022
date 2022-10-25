import java.util.Scanner;

public class PPBO_05_CharacterASCIIPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        in.close();
        for(int x = ((int)user.toCharArray()[0] < (int)user.toCharArray()[2] ? (int)user.toCharArray()[0] : (int)user.toCharArray()[2]); x <= ((int)user.toCharArray()[0] < (int)user.toCharArray()[2] ? (int)user.toCharArray()[2] : (int)user.toCharArray()[0]); x++)
            System.out.print((char)x);
    }
}