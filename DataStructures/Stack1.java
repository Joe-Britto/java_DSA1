package DataStructures;

class Stack{
	int a[] = new int[5];
	int top = -1 ;  // shows empty stack
	
	public void push(int data) {
		if (top == a.length-1) {
			System.out.println("Stack is Full.........");
		}else {
			top++;
			a[top] = data;
		    }
	   }
	
	public void pop() {  // to remove element from stack at one end
		if (top == -1) {
			System.out.println("Stack is Empty.........");
		}else {
			System.out.println("Popped element "+a[top]);
			a[top]=0;
			top--;
			
		    }
	}
	
	
	public void peek() {  // to remove element from stack at one end
		if (top == -1) {
			System.out.println("Stack is Empty.........");
		}else {
			System.out.println("Peek element "+a[top]); 
			// just to display top element is called peek
			 }
	}
	
	public void display() {  // to remove element from stack at one end
		if (top == -1) {
			System.out.println("Stack is Empty.........");
		}else {
			   
			for( int i = top; i >= 0; i--) {
			System.out.println("element i "+a[i]);
			}
			
			}
	  }
}

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Stack works on last in First out LIFO");
        System.out.println("it has only one end to add or remove values");
        System.out.println("implemented an array for stack operation");
        System.out.println("We can implement Linkedlist as well for stack operation");
		Stack ss = new Stack();
          ss.push(78);
          ss.push(63);
          ss.push(27);
          ss.push(9);
          ss.push(11);
          ss.display();
          ss.peek();
          ss.display();
          ss.pop();
          ss.display();
	}

}
