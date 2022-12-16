package strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I am a good boy";
		String s[] = s1.split(" ");

		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			String temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		String s3 = "";
		for (int k = 0; k < s.length; k++) {
			s3 = s3 + s[k] + " ";
		}
		System.out.println(s3);
	}

}
