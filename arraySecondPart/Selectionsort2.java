package arraySecondPart;

public class Selectionsort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {8,1,6,2,0};

int index=0;
for (int i = 0; i < a.length; i++) {
	index=i;
	for (int j = i+1; j < a.length; j++) {
		if(a[j]<a[index]) {
			index=j;
		}
	}
	int temp=a[index];
	a[index]=a[i];
	a[i]=temp;
}
for (int i : a) {
	System.out.println(i);
}

	}
	
}
