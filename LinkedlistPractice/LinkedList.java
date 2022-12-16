package LinkedlistPractice;

public class LinkedList<T> {

	Node<T> head;

	public void Add(T data) {
		if (head == null) {
			head = new Node<T>(data);
		} else {
			Node<T> temp = head;
			while (temp.Next != null) {
				temp = temp.Next;
			}
			temp.Next = new Node<T>(data);
		}
	}

	public void print() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.Next;
		}
	}

	public String toString() {
		String s = "[";
		Node<T> temp = head;
		while (temp != null) {
			if (temp.Next != null) {
				s = s + temp.data + ", ";
			} else {
				s = s + temp.data;
			}
			temp = temp.Next;
		}
		s = s + "]";

		return s;
	}

	public boolean myContain(T data) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.Next;
		}
		return false;
	}

	public void myAddAt(int index, T data) {
		Node<T> newOb = new Node<T>(data);
		Node<T> temp = head;
		int cnt = 0;
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
		}
		if (index == 0) {
			newOb.Next = head;
			head = newOb;
		} else {
			while (temp != null) {
				if (index - 1 == cnt) {
					newOb.Next = temp.Next;
					temp.Next = newOb;
					return;
				}
				temp = temp.Next;
				cnt++;
			}
		}
	}

}
