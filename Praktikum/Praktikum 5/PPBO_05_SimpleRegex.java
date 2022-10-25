import java.util.Scanner;

public class PPBO_05_SimpleRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        in.close();
        if(Character.toLowerCase(user.toCharArray()[0]) == 'a' || Character.toLowerCase(user.toCharArray()[0]) == 'i' || Character.toLowerCase(user.toCharArray()[0]) == 'u' || Character.toLowerCase(user.toCharArray()[0]) == 'e' || Character.toLowerCase(user.toCharArray()[0]) == 'o')
            System.out.print(1);
        else if(Character.toLowerCase(user.toCharArray()[user.length()-2]) == 'n' || Character.toLowerCase(user.toCharArray()[user.length()-1]) == 'g')
            System.out.print(2);
        else
            System.out.print(-1);
    }
}