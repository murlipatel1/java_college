import java.util.Scanner;

public class matrixaddmulti {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for matrix");
        int n= sc.nextInt();

        int[][] arr1= new int[n][n];
        System.out.println("Enter matrix 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 arr1[i][j] = sc.nextInt();
            }
        }

        int[][] arr2= new int[n][n];
        System.out.println("Enter matrix 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] sum = new int[n][n];
        System.out.println("The sum is ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 sum[i][j]= arr1[i][j] + arr2[i][j];
                 System.out.print(sum[i][j]);
            }
            System.out.println(" ");
        }
        

        int[][] prod = new int[n][n];
        System.out.println(" The product is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                prod[i][j]=1;
                prod[i][j]= arr1[i][j] * arr2[i][j];
                System.out.print(prod[i][j]);
            }
            System.out.println(" ");
        }
        
    }
    
}
