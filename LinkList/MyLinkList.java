package LinkList;

public class MyLinkList<T> {

	Node<T> head;

	void myAdd(T data) {
		if (head == null) {
			head = new Node<T>(data);
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node<T>(data);
		}

	}

	void myPrint() {
		Node<T> temp = head;

		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	String myToString() {
		String s = "[";
		Node<T> temp = head;
		while (temp != null) {
			if (temp.next != null) {
				s = s + temp.data + ", ";
			} else {
				s = s + temp.data;
			}
			temp = temp.next;
		}
		s = s + "]";
		return s;
	}

	boolean myContain(T data) {
		Node<T> temp = head;
		while (temp != null) {
			if (data == temp.data)
				return true;
			temp = temp.next;
		}
		return false;
	}

	void myAddAt(int index, T data) {
		Node<T> newOb = new Node<T>(data);

		Node<T> temp = head;
		int cnt = 0;
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("Out of bounds");
		}
		if (index == 0) {
			newOb.next = head;
			head = newOb;
		} else {
			while (temp != null) {
				if (index - 1 == cnt) {
					newOb.next = temp.next;
					temp.next = newOb;
					return;
				}
				temp = temp.next;
				cnt++;
			}
			throw new ArrayIndexOutOfBoundsException("out of bounds");
		}
	}

	void mySett(int index, T data) {
		Node<T> temp = head;
		int cnt = 0;
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("Out of bounds");
		} else {
			while (temp != null) {
				if (index == cnt) {
					temp.data = data;

					return;
				}
				temp = temp.next;
				cnt++;
			}
			throw new ArrayIndexOutOfBoundsException("out of bounds");
		}
	}

	Object myGet(int Index) {
		Node<T> temp = head;
		int cnt = 0;
		if (Index < 0) {
			throw new ArrayIndexOutOfBoundsException("out of Bounds");
		} else {
			while (temp != null) {
				if (cnt == Index) {
					return temp.data;
				}
				temp = temp.next;
				cnt++;
			}
			throw new ArrayIndexOutOfBoundsException("Out of Bounds");
		}
	}
	
	void myRemove(int index) {
		Node<T> temp=head;
		int cnt=0;
		if (index<0) {
		throw new ArrayIndexOutOfBoundsException("out of bounds");	
		}
		if(index==0) {
			head=head.next;
		return;	
		}
		else {
		while(temp!=null) {
			if (cnt==index-1) {
				temp.next=temp.next.next;
				return;
			}
			temp=temp.next;
			cnt++;
		}
		throw new ArrayIndexOutOfBoundsException("out of bounds");
		}
	}
	
	public MyLinkList<T> myClone() {
		
		MyLinkList<T> obj=new MyLinkList<T>();
		Node<T> temp=head;
		
		while(temp!=null) {
			obj.myAdd(temp.data);
			temp=temp.next;
		}
		return obj;
		
	}

}
