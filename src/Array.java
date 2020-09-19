import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int a[];
        a = new int[20];
        Scanner sc = new Scanner(System.in);

        int sum,i;
        sum=0;
        float avg;
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array: ");

        for(i=0;i<n;i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        avg = sum/n;
        System.out.println("Sum = "+sum);
        System.out.println("Avergae = "+avg);


    }
}
