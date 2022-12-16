package arraySecondPart;

public class bubbleSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,1,6,2,4,3};

for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length-1; j++) {
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
for (int i : a) {
	System.out.print(" "+i);
}
}

}
