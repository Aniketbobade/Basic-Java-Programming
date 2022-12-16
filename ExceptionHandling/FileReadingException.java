package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("abc.txt");
		FileInputStream fd=new FileInputStream(file);
		int i=fd.read();
		System.out.println((char)i);
	}

}
