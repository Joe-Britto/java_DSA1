package DataStructures;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("BinarySearch  alogrithm .In this ,first the  \n"
		 + "array should be a sorted array (ascd order).The lower \n"
		 + "index (lb lower bound) is 0 , the upper index \n"
		 + "(lb lower bound) is 'n'.The mid index No. is calculated\n"
		 + " (lb+ub)/2 i.e mid=(lb+ub)/2 ."
		 + ".The key element(search element) should be compared with \n"
		 + "mid index value , if (key< mid value), then serach will\n"
		 + "happen between lb value to mid value , if (key>mid value) then \n"
		 + "serach will mid value to ub value");
		System.out.println();
		int a[] = {11,22,33,44,55,66,77,88};
	    System.out.println("Content of Sorted array elements: "+Arrays.toString(a));
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter an int values from content to search\n"
	   		+ "also try entering with int values not from content ");
	   int key = sc.nextInt();
	   int  status = 0;
	   int lb = 0;          // lower bound index lb
	   int ub = a.length-1; // upper bound index ub
	   
	   while (lb <= ub) {
		   int mid = (lb + ub)/2;
		   if (a[mid] == key) {
			   System.out.println("Element foundt at "+mid);
			   status = 1;
			   break;
		   }
		   else if (a[mid] < key) {
			   lb = mid + 1;
		   }
		   else {
			   ub = mid - 1;
		   }
	   }
	   if (status == 0) {
	    	  System.out.println("Element Not found "); 
          }
	}

}
