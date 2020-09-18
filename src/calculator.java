import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 values :");
        double val1 = sc.nextDouble();
        double val2 = sc.nextDouble();


        System.out.println("Enter any operator one of the operator +,-,/,* :");
        char op = sc.next().charAt(0);
        double ans =0;
        switch (op)
        {
            case '+':
                ans = val1 + val2;
                break;
            case '-':
                ans =val1 - val2;
                break;
            case '*':
                ans = val1 * val2;
                break;
            case '/':
                ans = val1 / val2;
                break;
            default:
                System.out.println("Invalid operator");
                return;

        }
        System.out.println(val1+" "+op+" "+val2+"="+ans);
    }
}

