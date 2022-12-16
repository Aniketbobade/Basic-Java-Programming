package array;

public class ElementFind {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int element=6;
	
	int mid;
	int first=0;
	int last=a.length-1;
	
	while(first<=last) {
		mid=(first+last)/2;
		
		if(a[mid]==element) {
			System.out.println("Element Found");
			int count = 0;
		count++;
		System.out.println(count);
			break;
		
		}
		else if(a[mid]<element) {
			first=mid+1;
			
		}
		else {
			last=mid-1;
		}
		}
	if(first>last) {
		System.out.println("Element not Found");
	
	}
}
	
}
