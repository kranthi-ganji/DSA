package Queue;
class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
	private QueueNode front;
    private QueueNode rear;

    public void add(int value) {
        QueueNode newNode = new QueueNode(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;

        if (front == null) rear = null; // If front == null, it means the queue is now empty.
        								//So we also set rear = null to indicate that the back of the queue is empty too.
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.add(4);
		queue.add(14);
		queue.add(7);
		queue.add(12);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
	}

}
