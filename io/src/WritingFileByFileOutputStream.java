

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFileByFileOutputStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file = new File("d://file2.txt");
		String fileContent = "Text to be written in a file";
		try{
			fos = new FileOutputStream(file);
			if(!file.exists())
				file.createNewFile();
			
			fos.write(fileContent.getBytes());
			fos.flush();
		}catch(Exception e){
			
		}finally {
			try {
				if(fos != null)
					fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
