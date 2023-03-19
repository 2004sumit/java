import java.util.Scanner;

public class sumNatural {
    public static void main(String[] args) {
        System.out.println("Enter the number to calculate the sum upto that\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i= 0;

        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is "+  sum);
    }
}
