public class Latihan2B {
    public static void main(String[] args) {
        int sum = 0;
        for(int count = 1; count <= 30; count+=3)
            sum += count;
        System.out.println(sum);
    }
}

/*
    2.B Rewrite the following while loops as for statements
    
    int count = 1, sum = 0;
    while(count <= 30) {
        sum += count;
        count += 3;
    }
*/