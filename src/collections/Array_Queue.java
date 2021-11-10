package collections;

public class Array_Queue {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;

	public Array_Queue(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue Is Full");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			} else {
				queueArr[rear] = data;
				currentSize++;
				System.out.println("Data is added to Queue");
			}
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Is Empty");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from the Queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the Queue");
			}
			currentSize--;
		}
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Array_Queue array_Queue = new Array_Queue(5);
		array_Queue.enqueue(10);
		array_Queue.enqueue(20);
		array_Queue.dequeue();
	}
}
