package DataStructures;
import java.util.*;

public class SLList_Builtin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> sll = new LinkedList <String> ();
		
		sll.add("Welcome");
		sll.add("to");
		sll.add("built_in");
		sll.add("Single ");
		sll.add("LinkedList");
		sll.addFirst("Hi");
		sll.addLast("Thank you");
		
		System.out.println("Output :"+sll);		
		System.out.println("Size of LL: "+sll.size());
		System.out.println("Otherway of displaying LL values");
		for (int i = 0; i < sll.size(); i++) {
			System.out.print(" "+sll.get(i));
		}
		System.out.print(" null");

	}

}
