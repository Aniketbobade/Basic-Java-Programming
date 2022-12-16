package strings;

import java.io.IOException;
import java.io.StringReader;

public class LengthOfStringWithoutAnyMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s1="I am a Good boy";
		StringReader sr=new StringReader(s1);
		int i=0;
		int count=0;
		
		while((i=sr.read())!=-1) {
			System.out.println((char)i);
			count++;
		}
		System.out.println("Count is "+count);
	}

}
