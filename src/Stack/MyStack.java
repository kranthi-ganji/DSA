package Stack;

public class MyStack {  //USING ARRAYS
	private int maxSize;
	private int[] stackArray;
	private int top;
	//Constructor
	public MyStack(int maxSize){
		this.maxSize = maxSize;
		stackArray = new int[maxSize];
		top = -1;
	}
	public  void push(int value) {  //TC :- O(1)
		if(isFull()) {
			System.out.println("Stack is Full,so we can't push the value" + value);
			return ;
		}
		top++;
		stackArray[top] = value;
	}
	//removes the top value and returns the value
	public int pop() {  //TC :- O(1)
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int value = stackArray[top];
		top--;
		return value;
	}
	//Gives the top value
	public int peek() {  //TC :- O(1)
		if(isEmpty()) {
			System.out.println("Stack is empty can't give the peek value");
			return -1;
		}
		return stackArray[top];
	}
	public boolean isEmpty() { //TC :- O(1)
		return (top == -1) ;
	}
	public boolean isFull() { //TC :- O(1)
		return (top == maxSize - 1);
	}
	public int size() { //TC :- O(1)
		return top + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack st = new MyStack(5);
		st.push(2);
		st.push(5);
		st.push(9);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		st.pop();
		
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		
	}

}
