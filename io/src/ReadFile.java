

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * Program to read the content of the file
 */

/**
 * 
 * @author sujeetk1
 *
 */

public class ReadFile {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			/*
			 * Creating FileInputStream object
			 * @param File object
			 */
			fis = new FileInputStream(new File("d://file1.txt"));
			/*
			 * Creating BufferedInputStream Object
			 * @param input stream
			 */
			bis = new BufferedInputStream(fis);
			StringBuilder builder = new StringBuilder();
			while(bis.available() > 0){
				builder.append((char)bis.read());
			}
			
			System.out.println(builder);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(fis != null)
					fis.close();
				if(bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
