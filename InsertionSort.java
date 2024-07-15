import java.util.*;
import java.io.*;

class InsertionSort{
    
    void Sort(int arr[]){

        int n = arr.length;

        for(int i=0;i<n;i++){
            int x = arr[i];
            int j = i-1;
            while(j>=0 && j> x){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = x;
        }
    }

    static void PrintArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
    public static void main(String args[]){

        int arr[] = {12,11,13,5,6};
        InsertionSort obj = new InsertionSort();
        obj.Sort(arr);

        PrintArray(arr);
    }
}