package DataStructures;

class Node4{
	String str;
	Node4 next;
	
	Node4(String str){
		this.str =  str;
		this.next = null;
	}
}


class CircularLlist {
	Node4 head , tail = null;
	public void add(String str) {
		Node4 n4 = new Node4(str);
		
		if (head == null) {
			head = n4 ;
			tail = n4;
			n4.next = head;
		}else {
			tail.next = n4;
			tail = n4 ;
			n4.next = head;
		}
	 }
	
	public void display() {
		Node4 cur = head;
		if(head == null) {
			System.out.println("Empty Circular LL");
		}else {
			do {
				System.out.print(" "+cur.str);
				cur = cur.next;
			} while(cur != head);
//			System.out.print();
		}
	 }
	
  }
public class CircularLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLlist cll = new CircularLlist();
		cll.add("Hi");
		cll.add("Welcome");
		cll.add("to");
		cll.add("Circular");
		cll.add("LinkList");
		 cll.display();
		
	}

}
