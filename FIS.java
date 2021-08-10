/*Java IO Stream

package: java.io.*;

*/

import java.io.*;
class FIS{
	public static void main(String args[])throws Exception{
		File file=new File("m1.txt");
		FileInputStream fins=new FileInputStream(file);
		long n=file.length();
		byte[] b=new byte[(int)n];
		fins.read(b);
		FileOutputStream outputStream=new FileOutputStream("m2.txt");
		outputStream.write(b);
		System.out.println("Data written successfully");
	}
}