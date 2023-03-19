import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Operand\n");
        int a = sc.nextInt();
        System.out.println("Enter your Second Operand\n");
        int b = sc.nextInt();
        System.out.println("Enter the Operator\n");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                 break;
            case '-' : System.out.println(a-b);
                 break;
            case '*' : System.out.println(a*b);
                 break;
            case '/' : System.out.println(a/b);
               break;
         default : System.out.println("Syntax Error!!!");               
        }
    }
}
