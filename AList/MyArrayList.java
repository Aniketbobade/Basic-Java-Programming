package AList;

public class MyArrayList<T> {

	Object a[] = new Object[5];
	int index = 0;

	void add(T data) {
		if(index>=a.length) {
			Object[] b=new Object[(int) (a.length*1.75)];
			for (int i = 0; i < a.length; i++) {
				b[i]=a[i];
			}
			a=b;
		}
		a[index++]=data;
	}

	void print() {
		for (int i = 0; i < index; i++) {
			System.out.println(a[i]);
		}
	}

	boolean contain(T data) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == data) {
				return true;
			}
		}
		return false;
	}

	void remove(int indexRemove) {
		if (indexRemove < 0 || indexRemove > a.length) {
			throw new IndexOutOfBoundsException("Out of Bounds...");
		}
		for (int i = indexRemove; i < a.length - 1; i++) {
			 a[i] = a[i + 1];

		}
		index--;
	}

	Object[] myClone() {
		Object[] obj = new Object[index];
		for (int i = 0; i < index; i++) {
			obj[i] = a[i];
		}
		return obj;

	}

	Object myGetMethod(int ind) {

		for (int i = 0; i < index; i++) {
			if (i == ind) {
				return a[i];
			}
		}
		return -1;

	}

	int myIndexMethod(T data) {
		for (int i = 0; i < index; i++) {
			if (a[i] == data) {
				return i;
			}
		}
		return -1;

	}

	int myLastIndexMethod(T data) {
		for (int i = index - 1; i >= 0; i--) {
			if (a[i] ==  data) {
				return i;
			}
		}
		return -1;

	}

	boolean myIsEmpty() {
		if (index > 0) {
			return false;
		}
		return true;
	}

	int mySize() {
		return index;
	}

	void mySetMethod(int in, T data) {
		if (in < 0 || in > index) {
			throw new IndexOutOfBoundsException("out of range..");
		}
		for (int i = 0; i < index; i++) {
			if (i == in) {
				a[i] = (int) data;
			}
		}
	}

	void myAddAt(int in, T data) {
		if (index == a.length) {
			grow();
		}
		for (int i = index; i > in; i--) {
			a[i] = a[i - 1];
		}
		a[in] = (int) data;
		index++;

	}

	void grow() {

		int in = 0;
		Object b[] = new Object[(int) (a.length * 1.75)];
		for (int i = 0; i < a.length; i++) {
			b[in++] = a[i];
		}
		a = b;
	}
	
	String myToString() {
		String s="[";
		for (int i = 0; i < index; i++) {
			if(i<index-1) {
				s=s+a[i]+", ";
			}
			else {
				s=s+a[i];
			}
		}
		s=s+"]";
		
		return s;
		
	}
	
	Object[] myToArray() {
		Object[] newA=new Object[index];
		for (int i = 0; i < index; i++) {
			newA[i]=a[i];
		}
		return newA;
	}
}
