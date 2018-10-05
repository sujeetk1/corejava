

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * Program to read a file through BufferedReader 
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class ReadFileUsingBufferedReader {

	public static void main(String[] args) {
		BufferedReader bf1 = null;
		BufferedReader bf2 = null;
		
		try{
			bf1 = new BufferedReader(new FileReader(new File("d://file1.txt")));
			
			String line = bf1.readLine();
			while(line != null){
				System.out.println(line);
				line = bf1.readLine();
			}
		}catch(Exception e){
			
		}
		
		try{
			bf2 = new BufferedReader(new FileReader(new File("d://file1.txt")));
			
			StringBuilder filetxt = new StringBuilder();
			int num = 0;
			while((num = bf2.read()) != -1){
				filetxt.append((char)num);
			}
			System.out.println(filetxt);
			
		}catch(Exception e){
			
		}

	}

}
