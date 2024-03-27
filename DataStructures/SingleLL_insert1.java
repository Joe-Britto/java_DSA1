package DataStructures;

   class Node2{
	 int data; // data default value is 0
	 Node2 next; // next is a reference variable or pointer or address 
	             //of a next class Node.next  or object. its default value is null
	
	Node2 (int data){  
		this.data = data;
		this.next = null;
		  }
     }

   class SingleLL{
          public Node2 head = null;  
          public Node2 tail = null;  
 
  
   
        public void addNode(int data) {
		//create new node
		Node2 newNode = new Node2(data);
				
		if(head == null) {
			 
			 head = newNode;  
			 tail = newNode;
			}
		      
		 else {  
			 tail.next = newNode; 
			 tail = newNode; 
			 }
	       }
        
        public void addAtStart(int data) {
    		//create new node
    		Node2 newNode = new Node2(data);
    				
    		if(head == null) {
    			 
    			 head = newNode;  
    			 tail = newNode;
    			}
    		      
    		 else {  
    			  Node2 temp = head;
    			 head = newNode; 
    			 head.next = temp; 
    			 }
    	       }
    	   
        public void addAtMid(int data) {
    		//create new node
    		Node2 newNode = new Node2(data);
    			Node2 cur2 = head;
    			Node2 temp2 = head;
    			int count =0; 
    			while (cur2 != null) {
   	    		  		  
   	    		  cur2 = cur2.next;//
   	    		  count++;
   	    		  }
    		
    			if(count < 2) {
    			System.out.println("List length should be atlest 2 nodes");
	    		  return;
    			 
    			}
    		      
    		 else { 
    			 int midNo = ( count % 2 == 0)? (count/2):((count+1)/2);
    			// cur2 = null;
    			 for (int i = 0 ; i< midNo; i++) {
    			 cur2  = temp2; 
    			 temp2 = temp2.next; 
    			 }
    			  cur2.next = newNode;
    			  newNode.next = temp2;
    		    }			 
    	   }
	      public void display() {

	    	  Node2 current = head;   
	    	  if(head == null) {
	    		  System.out.println("List is empty .....");
	    		  return;
	    	  }
	    	  
	    	  System.out.println("output of a Single LinkedList is :  ");
	    	  
	    	  while (current != null) {
	    		  //prints each node by incrementing pointer
	    		  System.out.println(current.data + " ");
	    		  current = current.next;// current variable moves to the next node
	    	  }
	 }
}      
	
	public class SingleLL_insert1{
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("Single LL to insert node at beginning, mid and last");
		SingleLL sList = new SingleLL();
		    
		   sList.addNode(23);
		   sList.addNode(63);
		   sList.addNode(87);
		 //  sList.addAtStart(62);
		   sList.addNode(02);
		   sList.addAtMid(15);
		   sList.addAtStart(62);
		   sList.display();
		
        }
	}


