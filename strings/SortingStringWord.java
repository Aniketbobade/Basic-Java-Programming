package strings;

public class SortingStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="afjsdpofk";
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			}
		for (char c : ch) {
			System.out.print(c+" ");
		}
	}

}
