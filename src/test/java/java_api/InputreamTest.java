package java_api;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InputreamTest {
	
	public static void main(String[] args) throws IOException {

		byte[] byteArr = new byte[1024];
		System.in.read(byteArr, 0, byteArr.length);
//		System.out.write(byteArr);
		OutputStream out = new ByteArrayOutputStream();
		out.write(byteArr);
		String inputContend = out.toString();
		System.out.println("您输入的内容是："+inputContend);
		out.flush();
		out.close();
		
		
	}
}
