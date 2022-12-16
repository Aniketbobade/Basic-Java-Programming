package LinkList;

public class MyMainLinkedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkList<Integer> list=new MyLinkList<Integer>();
		list.myAdd(10);
		list.myAdd(20);
		list.myAdd(30);
		list.myAdd(40);
		list.myAdd(50);
//		list.myPrint();
		
//		System.out.println(list.myToString());
//		
//		
//		System.out.println(list.myContain(20));
//		
//		list.myAddAt(3, 25);
//		list.myPrint();
//		list.mySett(2, 50);
//		list.myPrint();
//		System.out.println(list.myGet(2));
		list.myRemove(2);
		list.myPrint();
		MyLinkList<Integer> obj=new MyLinkList<>();
		
	}

}
