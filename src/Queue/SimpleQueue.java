package Queue;

public class SimpleQueue {
	private int maxSize;
	private int[] queueArray;
	private int rear;
	private int front;
	public SimpleQueue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new int[maxSize];
		rear = -1;
		front = 0;
	}
	//add -- add value at the rear
	public void add(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear++;
		queueArray[rear] = value;
		
	}
	//poll - removes and return the element at the front
	public int poll() {
		if(isEmpty()) {
			System.out.println("Queue is empty can't poll");
			return -1;
		} 
		int value = queueArray[front];
		front++;
		return value;
	}
	//peek - return the value at front
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty can't peek");
			return -1;
		}
		int value = queueArray[front];
		return value;
	}
	public boolean isEmpty() {
		return front > rear;
	}
	public boolean isFull() {
		return rear == maxSize-1;
	}
	public int size() {
		return (rear - front + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleQueue queue = new SimpleQueue(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Peek: " + queue.peek());      // 10
        System.out.println("Poll: " + queue.poll());      // 10
        System.out.println("Peek after poll: " + queue.peek());  // 20
        queue.add(40);
        queue.add(50);
        System.out.println(queue.size());
        queue.add(60); // Should print "Queue is full"

	}

}
