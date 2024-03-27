package DataStructures;

class DllNode{
	DllNode previous ;
	DllNode next ;
	int data;
	
	DllNode(int data){
		this.data = data;
		this.previous = null;
		this.next = null;
	}
}

class DLinkedList {
	 DllNode head = null ;
	 DllNode tail = null;
	public void addDll(int data) {
		
		DllNode newNode = new DllNode(data);
		  if(head == null) {
			  head = newNode;
			  tail = newNode;
			  head.previous = null;
			  tail.next = null;
			}else {
				   tail.next = newNode;
				   newNode.previous = tail;
				   tail = newNode;
				   tail.next = null;
			    }
	      }
	
	     public void display() {
	    	 DllNode cur = head;
	    	 if (head == null) {
	    		 System.out.println("Empty Linked list...");
	    		 return;
	    	 }else {
	    		    while(cur != null) {
	    		    	System.out.println(" "+cur.data);
	    		    	cur = cur.next;
	    		    }
	    	 }
	     }
    }
	

public class DoubleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLinkedList  dllobj = new DLinkedList();
		dllobj.addDll(55);
		dllobj.addDll(9);
		dllobj.addDll(37);
		dllobj.addDll(64);
		dllobj.display();
		

	}

}
