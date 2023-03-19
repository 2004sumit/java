import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        System.out.println("Enter the range\n");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int counter = 0;

        while(counter <= range){
            System.out.print(counter + " ");
            counter++;
        }

     System.out.println();
    }
}
