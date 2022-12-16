package strings;

public class DistionarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string="Welcome To The World Of Programming";
String s=string.toLowerCase();
String sa[]=s.split(" ");

for (int i = 0; i < sa.length; i++) {
	for (int j = 0; j < sa.length; j++) {
		if(sa[i].compareTo(sa[j])<0) {
			String temp=sa[i];
			sa[i]=sa[j];
			sa[j]=temp;
		}
	}
}
for (int i = 0; i < sa.length; i++) {
	System.out.println(sa[i]);
}
	}

}
