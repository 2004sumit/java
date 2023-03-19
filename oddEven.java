import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        System.out.println("Enter  number");
        Scanner sc = new Scanner(System.in);
       
        int num1 = sc.nextInt();
        
        if(num1 % 2 == 0){
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is a odd number");
        }
    }
}
