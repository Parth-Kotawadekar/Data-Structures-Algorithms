
import java.util.*;
import java.util.Scanner;

class Linear_Search{

    //Creating linear search method
    public static int Search(int[] array, int n, int x){
        for(int i=0;i<n;i++){
            if(array[i] == x)
                return i+1;
        }
        return -1;
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        int n=sc.nextInt();

        //Reading the numbers in array
        System.out.println("Enter "+ n +" numbers.");
        int array[] = new int[n];
        for(int i=0;i<=n;i++){
            array[i] = sc.nextInt();
        }

        //Searching an element
        System.out.println("Enter an element to be found: ");
        int x=sc.nextInt();

        //Calling search method
        int position = Search(array,n,x);

        if(position == -1){
            System.out.println("Not found...");
        }
        else{
            System.out.println("Found at " + position + " postion");
        }
    }
}