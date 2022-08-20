import java.util.Scanner;

public class arrayminmaxmethod {
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] array= new int[n];

        for(int i=0 ;i<n ; i++ ){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the cases 1.sum 2. product 3.max 4.min 5.sort 6. division ");
        int e=sc.nextInt();

        switch(e){
        case 1:
            sum(array, n);
            break;
        case 2:
            product(array, n);
            break;
        
        case 3:
            maxnum(array, n);
            break;

        case 4:
            minnum(array, n);
            break;
        
        case 5:
            sort(array, n);
            break;
        
        case 6:
            div(array, n);
            break;
        }


        sc.close();
        
    }

    static void sum(int array[], int n){
        int sum=0;
        for(int i=0;i<n; i++){
            sum=sum+ array[i];
        }
        System.out.println("Sum " +sum);
    }

    static void product(int array[] , int n){
        int prod=1;
        for(int i=0;i<n; i++){
            prod=prod *array[i];
        }
        System.out.println("Product " +prod);
    }

    static void maxnum(int array[], int n){
        int max=array[0];
        for(int i=1 ; i<n ; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
    }

    static void minnum(int array[], int n){
        int min=array[0];
        for(int i=1 ; i<n ; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
    }

    static void sort(int array[] , int n){

        for (int i = 0; i < array.length; i++)   
    {  
        for (int j = i + 1; j < array.length; j++)   
        {  
        int tmp = 0;  
        if (array[i] > array[j])   
        {  
        tmp = array[i];  
        array[i] = array[j];  
        array[j] = tmp;  
        }  
    }
    System.out.println(array[i]);  
            }  
        } 
            
    static void div(int array[], int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%15==0){
                System.out.println("the number divisible by 15 " + array[i]);
            }
        }
    }
    }
