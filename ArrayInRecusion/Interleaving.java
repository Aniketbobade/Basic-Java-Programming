package ArrayInRecusion;

public class Interleaving {
static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char s1[] = { 'a', 'b', 'c', 'd' };
		char s2[] = { 'w', 'x', 'y', 'z' };
		char s3[] = new char[s1.length + s2.length];
		
		s3=loop1(0,s1,s2,s3);
		for (int i = 0; i < s1.length || i < s2.length; i++) {
			
		}
		loop2(0,s3);
		for (int i=0;i<s3.length;i++) {
			
		}
	}

	private static void loop2(int i, char[] s3) {
		// TODO Auto-generated method stub
	if(i<s3.length) {
		System.out.println(s3[i]);
		i++;
		loop2(i, s3);
	}
	}

	private static char[] loop1(int i, char[] s1, char[] s2, char[] s3) {
		// TODO Auto-generated method stub
		if(i<s1.length || i<s1.length) {
			if (i < s1.length) {
				s3[index++] = s1[i];

			}
			if (i < s2.length) {
				s3[index++] = s2[i];
			}
			
			i++;
			s3=loop1(i, s1, s2, s3);
		}
		return s3;
	}

}
