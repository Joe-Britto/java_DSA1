package DataStructures;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Bubble sort is a sorting alogrithm by swapping \n"
     		+ "an array elements ,for ascending or decending order");
     System.out.println();
     int a[] = {14,10,21,70,05,32,58,28};
     System.out.println("Content of an array elements: "+Arrays.toString(a));
     System.out.println("output of an array in ascn/desc order or Bubble sort ");
     
         for (int i = 0; i<a.length-1; i++) {
        	 for (int j = 0; j<a.length-1; j++) {
        		 if (a[j] > a[j+1]) {
        			 int temp = a[j];
        			 a[j]= a[j+1];
        			 a[j+1] = temp;
        		 }
        		}
             }
         System.out.println(Arrays.toString(a));
	}
}
