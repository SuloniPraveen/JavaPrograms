import java.util.Scanner;
public class matrices {
    public static void main(String[] args) {
        int a[][],b[][];
        a = new int[20][20];
        b = new int[20][20];
        int c[][];
        c= new int[20][20];
        Scanner sc = new Scanner(System.in);
        int n,m,p,q,i,j;
        System.out.println("Enter the rows and columns of 1st matrix and 2nd matrix: ");
        n= sc.nextInt();
        m= sc.nextInt();
        System.out.println("Enter the elements of the 1st matrix: ");
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
                a[i][j]= sc.nextInt();
        System.out.println("Enter the elements of the 2nd matrix: ");
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
                b[i][j]= sc.nextInt();
        System.out.println("The sum of the 2 matrices are: ");
        for(i=0;i<n;i++) {
            for (j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
