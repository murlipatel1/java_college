import java.util.Scanner;

public class Gradeandmarks4 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of student");

        int marks = sc.nextInt();

        sc.close();

        if(marks<=100 && marks>=90){
            System.out.println("A grade");
        }else if(marks<90 && marks>=80){
            System.out.println("B grade");
        }else if(marks<80 && marks>=60){
            System.out.println("C grade");
        }else if(marks<60 && marks>=45){
            System.out.println("D grade");
        }else if(marks<45 && marks>=35){
            System.out.println("E grade");
        }else if(marks<35){
            System.out.println("FAIL");
        }
        
    }
}
