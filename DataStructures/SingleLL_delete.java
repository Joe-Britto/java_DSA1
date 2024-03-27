package DataStructures;

class Node3{
	int data;
	Node3 next;
	
	Node3(int data){
		this.data = data;
		next = null;
	 }
}


class Sll3{
	Node3 head , tail;
	
	public void addN3 (int val) {
		
		Node3 newN3 = new Node3(val);
		if (head  == null) {
			head = newN3;
			tail = newN3;
			}
		else {
			tail.next = newN3;
			tail = newN3;
		   }
	 }
		
		public void  display() {
			Node3 cur = head;
			if (head == null) {
				System.out.println("Empty List without any Node");
				return;
				
			}else {
				   
				while (cur != null) {
					System.out.println(cur.data);
					 cur = cur.next;
				   }
			     }
		   }
		
		public void  delBegin() {
			if (head == null) {
				System.out.println("Empty List without any Node");
				return;
				
			     }else {
				  // checks whether list contains just one node
				   if (head != tail) {
					   head = head.next; 
					   // removes the 1st node and head moves to the second node
					}else { 
					// this removes or deletes the one node and makes list empty
					   head = tail =null;
				   }
				 }
		      }
		
		
		
		public void  delEnd() {
			if (head == null) {
				System.out.println("Empty List without any Node");
				return;
				
			     }else {
				  // checks whether list contains just one node
			    	 
				   if (head != tail) {
					   Node3 curr3 = head;
					   while(curr3.next != tail) {
						   curr3 = curr3.next;
					   }
					   tail = curr3; 
					   tail.next =null;
					  //removes the last node and makes the previous node as null
					}else { 
					// this removes or deletes the one node and makes list empty
					   head = tail =null;
				   }
				 }
		      }
		
		
		
		public void  delMid() {
			
			Node3 cur4 =head;
			Node3 temp4 = head;
			int count = 0;
//			int midcount ;
			while (cur4!=null) {
				  cur4 = cur4.next;
				count++;
				}
			if (count < 3)
			{
				System.out.println("Size of Linkedlist should be atleast 3 to\n"
						+ "perform mid delete node in a list");
				return;
			}
			
			int midval = (count % 2 == 0)?(count/2):((count+1)/2);
			
			if (head == null) {
				System.out.println("Empty List without any Node");
				return;
				 }else {
					 cur4 = null;
				      for (int i = 0; i<midval-1; i++) {
				    	  cur4 = temp4;
				    	//in last  loop a node before midnode is assigned to cur4
				    	  temp4 = temp4.next;
				    	  //now tem4 moves to the midnode 
				    	  }
				      cur4.next = temp4.next; 
				      // midnode address part is assigned to cur4 reference part
				      temp4 = null;//here midnode is removed 
				 }
		      }
}

public class SingleLL_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sll3 n3 = new Sll3();
		    n3.addN3(12);
		    n3.addN3(75);
		    n3.addN3(04);
		    n3.addN3(39);
		    n3.addN3(41);
		    
		    n3.display();
//		    System.out.println("Deleted 1st Node from the list");
//		    n3.delBegin();
//		    System.out.println("Deleted end/last Node from the list");
//		    n3.delEnd();
		    System.out.println("Deleted Middle Node from the list");
		    n3.delMid();
		    n3.display();

	}

}
