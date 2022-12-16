package prelimsetA4April;
class MyArrayList<T>{
	Object a[]=new Object[5];
	int index=0;
	public void add(T data) {
	if (index>=a.length) {
		Object b[]=new Object[(int) (a.length*1.75)];
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		a=b;
	} 
	a[index++]=data;
	}
	
	void print() {
		for (int i = 0; i < index; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Integer> obj=new MyArrayList<>();
		obj.add(12);
		obj.add(11);
		obj.add(13);
		obj.add(45);
		obj.add(55);
		obj.add(65);
		obj.print();
		
		
	}

}
