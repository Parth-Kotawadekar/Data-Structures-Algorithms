import java.util.Scanner;
import java.util.*;

class Binary_Search {
    public static int Search(int[] array,int first, int last, int x){

        int mid = (first + last)/2;

        while(first <= last){
            if(array[mid]<x){
                first = mid+1;
            }else if(array[mid] == x){
                System.out.println("Element found at index " + mid);
                break;
            }else{
                last = mid+1;
            }
            mid = (first + last)/2;
        }
        if(first>last){
            System.out.println("Element not found");
        }
        return mid;
    }
    
    public static void main(String args[]){

        int[] array = {10,40,60,80,01};
        int x = 01;
        int last = array.length-1;

        Search(array, 0, last, x);
    }
}
