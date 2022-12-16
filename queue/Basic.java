package queue;

public class Basic {
	static int a[] = new int[5];
	static int rear = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		offer(5);
		offer(4);
		offer(3);
		offer(6);
		offer(7);
		offer(8);
		print();
		System.out.println("poll method");
		poll();
		print();
	}

	private static void poll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < rear - 1; i++) {
			a[i] = a[i + 1];
		}
		rear--;
		if (rear == 0) {
			System.out.println("Queue is empty");
		}
	}

	private static void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i <rear; i++) {
			System.out.println(a[i]);
		}
	}

	private static void offer(int data) {
		// TODO Auto-generated method stub
		if (rear < a.length) {
			a[rear] = data;
			rear++;
		} else {
			System.out.println("Queue is full");
		}
	}

}
