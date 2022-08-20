import java.util.Scanner;

public class PyramidNamePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String str = sc.nextLine();
        sc.close();
        int i, j, row =str.length() ;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                // prints star
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}