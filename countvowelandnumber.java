import java.util.Scanner;

public class countvowelandnumber {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str =str.toLowerCase();
        int vCount=0, nCount=0 ;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' ||str.charAt(i)== 'o' || str.charAt(i)== 'u'){
                vCount++;
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                nCount++;
            }
            
        }
        System.out.println("the vowels are "+ vCount + " number are " + nCount);
        
    }
}
