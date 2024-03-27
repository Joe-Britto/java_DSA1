package DataStructures;
import java.util.Arrays;
import java.util.Scanner;


public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Linear Search  alogrithm .In this we look for \n"
		     		+ "a particular element in an array.Disadvantages is that,it\n"
		     		+ "takes lot of time when array size is too big by going thru\n"
		     		+ "each and every element.");
		System.out.println();
		int a[] = {14,10,21,70,05,32,58,28};
	    System.out.println("Content of an array elements: "+Arrays.toString(a));
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter an int values from content to search\n"
	   		+ "also try entering with int values not from content ");
	   int key = sc.nextInt();
	   int  status = 0;
	   for (int i = 0; i<a.length; i++) {
		      if (a[i] == key) {
		    	  System.out.println("Element found at "+i +"  location" );
		    	  status = 1;
		    	  break;
		      }
		    }
	   if (status == 0)
	    	  System.out.println("Element Not found " );  
	}

}
