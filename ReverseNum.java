import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        printNumb(a);

    }
    public static void printNumb(int n){
        if (n==0) {             //base case
            return;
        }
        System.out.print(n+" ");    //print
        printNumb(n - 1);   //recursion
    }
}
