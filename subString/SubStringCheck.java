package subString;

public class SubStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbd";
		int maxLength = 0;
		int startIndex = 0;
		int EndIndex = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				char ch = s.charAt(j);
				boolean flag = false;
				for (int k = i; k < j; k++) {
					if (s.charAt(k) == ch) {
						flag = true;
						break;
					}
				}
				if (flag == true) {
					if (j - i > maxLength) {
						maxLength = j - i;
						startIndex = i;
						EndIndex = j - 1;
					}
					break;
				}
				else if(j==s.length()-1) {
					if((j-i+1)>maxLength){
						maxLength=j-i;
						startIndex=i;
						EndIndex=j;
					}
				}
			}
		}
		for (int i = startIndex; i <=EndIndex; i++) {
			System.out.print(s.charAt(i));
		}
	}

}
