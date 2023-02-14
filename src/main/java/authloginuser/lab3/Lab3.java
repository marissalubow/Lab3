/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package authloginuser.lab3;

/**
 *
 * @author marissalubow
 */
import java.util.Scanner; 

public class Lab3 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
        int arraySize = input.nextInt(); 
        int[] integers = new int[arraySize]; 
        
        for(int i=0; i<integers.length; i++)
        {
            integers[i] = input.nextInt();
        }
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Array not sorted: ");
        
        for(int x: integers)
        {   
            System.out.print(x + " ");
        }
        
        System.out.println("------------------------------------------------");
        
        sort(integers, arraySize); 
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Array sorted: ");
        
        for(int x: integers)
        {
            System.out.print(x + " "); 
        
        }
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Linear search: ");
        
        int findValue = input.nextInt();  
        
        System.out.println("Value found: ");
        linearSearch(integers, arraySize, findValue);
        
        System.out.println("------------------------------------------------");
        System.out.println("Binary search: "); 
        
        int findValue2 = input.nextInt();  
        System.out.println("Value found: ");
        binarySearch(findValue, integers);
        
    }
    
    //Selection sort
    public static void sort(int arr[], int size)
    {
       int outer; 
       int inner; 
       int min; 
       
       for(outer = 0; outer < size-1; outer++)
       {
           min = outer; 
           for(inner = outer+1; inner<size; inner++)
           {
               if(arr[inner] < arr[min])
                   min = inner; 
           }
           
           int temp = arr[outer]; 
           arr[outer] = arr[min]; 
           arr[min] = temp; 
       }
    }
    
    //Linear search 
    public static void linearSearch(int arr[], int x, int y)
    {
        int i = 0; 
        int location; 
        
        while(i<=x && y != arr[i])
            i = i +1; 
        if(i<=x)
        {
            location = i; 
            System.out.println(y);
        }
            
        else 
        {   
            location = -1; 
            System.out.println("Value not in this array");
        }
    }
    
    //Binary Search 
    public static int binarySearch(int x, int arr[])
    {
        int start = 0; 
        int end = arr.length - 1; 
        
        while(start <= end)
        {
            int middle = (start + end) /2; 
            
            if(x < arr[middle]) 
            {    
                end = middle -1; 
                System.out.println(x);
            }
            if(x > arr[middle])
            {   
                start = middle +1; 
                System.out.println(x);
            }
            if(x == arr[middle])
            {   
                System.out.println(x);
                return middle;
            }
            
        }
        return -1; 
    }
}
