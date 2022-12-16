package stack;

import java.util.Arrays;

public class Basic {
static int a[]=new int[5];
static int index=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(100);
		push(320);
		push(54);
		push(62);
		push(90);
		print();
		System.out.println("Pop method call");
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
	private static void print() {
		System.out.println(Arrays.toString(a));
		for(int i=0; i<index; i++) {
			System.out.println(a[i]);
		}
	}
	private static int pop() {
		if(index>0) {
		index--;
		return a[index];
		}
		else {
			System.out.println("Stack is empty");
		}
		return index;
	}
	private static void push(int data) {
		// TODO Auto-generated method stub
		if(index<a.length) {
			a[index++]=data;
		}
		else {
			System.out.println("Stack is full");
		}
	}

}
