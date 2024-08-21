package learning;

import java.util.Scanner;

public class bubbleSort {
  protected static Scanner sc= new Scanner(System.in);
	   public static void Sort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                               
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }
	        
	  
	    }  
	    public static void main(String[] args) {  
	    	System.out.println("enter the size of an array :");
	    	int n=sc.nextInt();
	    	int arr[]= new int[n];
	               System.out.println("enter the array elemtnts");
	    	for(int i=0; i < arr.length; i++){  
                arr[i]=sc.nextInt();  
        }
	                 
	                System.out.println("Array Before Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	                
	                System.out.println();  
	                   
	                Sort(arr);
	                 
	                System.out.println("Array After Bubble Sort :" );  
	                  
	                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                } 
	        }  
	}  

