import java.util.Scanner;

public class countcapital {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        sc.close();

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i)<= 'Z' && str.charAt(i-1)==' '){
                count++;
            }
            
        }
        System.out.println("Total capital letter are :" +count);
        
        
    }
    
}
