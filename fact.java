import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(printFact(n));
    }
    public static int printFact(int n){
        if (n == 1||n==0) {
            return 1;
        }
        return printFact(n-1)*n;
    }
}
