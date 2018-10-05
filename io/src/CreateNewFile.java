

import java.io.File;

/*
 * Program to create a file 
 */

/**
 * 
 * @author sujeetk1
 *
 */
public class CreateNewFile {

	public static void main(String[] args) {
		
		try{
			File file = new File("d://file1.txt");
			
			boolean flag = file.createNewFile();
			if(flag)
				System.out.println("file created");
			else
				System.out.println("file not created");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
