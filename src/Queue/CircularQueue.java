 package Queue;

public class CircularQueue {
	private int maxSize;
	private int[] queueArray;
	private int rear;
	private int front;
	private int currentSize;
	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new int[maxSize];
		rear = -1;
		front = 0;
		currentSize = 0;
	}
	//add -- add value at the rear
	public void add(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1) % maxSize;
		currentSize++;
		queueArray[rear] = value;
		
	}
	//poll - removes and return the element at the front
	public int poll() {
		if(isEmpty()) {
			System.out.println("Queue is empty can't poll");
			return -1;
		} 
		int value = queueArray[front];
		front = (front + 1) % maxSize;
		currentSize--;
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
		return currentSize == 0;
	}
	public boolean isFull() {
		return currentSize == maxSize;
	}
	public int size() {
		return currentSize;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue queue = new CircularQueue(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Peek: " + queue.peek()); // 10
        System.out.println("Removes the peek value: " + queue.poll()); // 10
        System.out.println("Peek after dequeue: " + queue.peek()); // 20

	}

}
