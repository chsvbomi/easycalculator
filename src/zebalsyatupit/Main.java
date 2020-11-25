package zebalsyatupit;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        long num1 = scanner.nextLong();
        char op = scanner.next().charAt(0);
        long num2 = scanner.nextLong();

        switch (op){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                if (num2==0){
                    System.out.println("Division by 0!");
                break;
                }
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                if (num2==0){
                    System.out.println("Divising by 0!");
                break;
                }
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}
