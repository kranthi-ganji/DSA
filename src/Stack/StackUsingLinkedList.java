package Stack;
class StackNode{
	int data;
	StackNode next;
	
	StackNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class StackUsingLinkedList {
	private StackNode top;
	
	public void push(int value) {
		StackNode newNode = new StackNode(value);
		newNode.next = top;
		top = newNode;
	}
	//returns and removes top value
	public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
	//returns the top value
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(3);
		stack.push(13);
		stack.push(30);
		stack.push(300);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
