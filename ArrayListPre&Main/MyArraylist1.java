package ArrayList;

public class MyArraylist1<T> {
	Object a[] = new Object[5];
	int index = 0;

	public void add(T data) {
		if (index >= a.length) {
			Object b[] = new Object[(int) (a.length * 1.75)];
			for (int i = 0; i < a.length; i++) {
				b[i] = a[i];
			}
			a = b;

		}
		a[index++] = data;
	}

	void print() {
		for (int i = 0; i < index; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	void remove(int removeIndex) {
		for (int i = removeIndex; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		index--;
	}
	
	 Object[] myClone() {
		Object Obj[]=new Object[index];
		for (int i = 0; i < index; i++) {
			Obj[i]=a[i];
		}
		 return Obj;
		
	}
	 Object myGet(int ind) {
		for (int i = 0; i < index; i++) {
			if (i==ind) {
				return a[i];
			}
		}
		 return -1;
		 
	 }
	 int indexOf(T data) {
		for (int i = 0; i < index; i++) {
			if (a[i]==data) {
				return i;
			}
		}
		 return -1;
		 
	 }
	 
	 void mySet(int in, T data) {
		 for (int i = 0; i < index; i++) {
			if (i==in) {
				a[i]=data;
			}
		}
	 }
public static void main(String[] args) {
	MyArraylist1<Integer> LL=new MyArraylist1<>();
	LL.add(12);
	LL.add(23);
	LL.add(24);
	LL.add(25);
	LL.add(26);
	LL.add(27);
	
	LL.add(28);
	LL.add(29);
	
	LL.print();
	System.out.println();
	LL.remove(3);
	LL.print();
	LL.myClone();
	System.out.println();
	LL.print();
	System.out.println(LL.myGet(2));
	System.out.println();
	System.out.println(LL.indexOf(28));
	
}
}
