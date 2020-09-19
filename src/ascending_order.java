import java.util.Scanner;
public class ascending_order {
    public static void main(String[] args){
        int a[],i,temp;
        a = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();

        for(i=0;i<n;i++) {
            for (int j = i + 1; j <n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The array elements after sorting: ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"\t");

    }
}
