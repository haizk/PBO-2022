import java.util.Scanner;

public class PPBO_05_StringMethod {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        in.close();
        for(int x=0; x<user.length(); x+=3)
            System.out.print(user.toCharArray()[x]);
    }
}