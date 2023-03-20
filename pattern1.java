import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows\n");
        int n = sc.nextInt();
        System.out.println("Enter the no. of collum\n");
        int m = sc.nextInt();
        
        //outer loop
        for(int row =1; row<=n; row++){
            //inner loop
            for(int col =1; col<= m; col++){
                System.out.print("*");
            }
            System.out.println();
          }
        }
}
