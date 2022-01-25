import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int sum = printSum(a);
        System.out.println(sum);
    }
    public static int printSum(int n){
        if (n==0){
            return 0;
        }
        return printSum(n-1)+n;
    }
}
