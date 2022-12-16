package arraySecondPart;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,8,2,5,6};
for (int i = 0; i < a.length; i++) {
	int index=i;
	for (int j = i+1; j < a.length; j++) {
		if(a[j]<a[index]) {
			index=j;
		}
	}
	int temp=a[index];
	a[index]=a[i];
	a[i]=temp;
}

for(int x:a) {
	System.out.println(x);
}
	}

}
