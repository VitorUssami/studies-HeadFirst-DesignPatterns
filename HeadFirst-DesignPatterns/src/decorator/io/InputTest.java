package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	
	public static void main(String[] args) {
		int c;
		try{
			String path = InputTest.class.getClassLoader()
					.getResource("decorator/io/test.txt").getPath();
			InputStream is = new LowerCaseInputStream(new BufferedInputStream(
					new FileInputStream(path)));
			while ((c = is.read()) >= 0) {
				System.out.print((char)c);
			}
			is.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
