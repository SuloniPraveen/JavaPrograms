import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of terms: ");
        n = sc.nextInt();
        int t1=0;
        int t2=1;
        int term;
        System.out.println("Fibonacci series: ");
        System.out.println(t1);
        System.out.println(t2);
        int i=0;
        while(i<n)
        {
            term = t1+t2;
            System.out.println(term);
            t1=t2;
            t2=term;
            i++;
        }



    }
}
