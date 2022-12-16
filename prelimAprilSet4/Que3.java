package prelimAprilSet4;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdXYZ";
		String s2=s1.toUpperCase();
		String s3="";
		for (int i = 0; i < s2.length(); i++) {
			s3=s3+(char)(155-s2.charAt(i));
		}
		System.out.println(s3);
	}

}
