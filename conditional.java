import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if( age >= 18){
            System.out.println("You can vote");
        }

        if(age >13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("You can't vote");
        }
    }
}
