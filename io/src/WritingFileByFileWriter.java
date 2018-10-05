

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileByFileWriter {

	public static void main(String[] args) {
		BufferedWriter  bw = null;
		String fileContent = "Text to be written in a file";
		try{
			bw = new BufferedWriter(new FileWriter(new File("d://file3.txt")));
			bw.write(fileContent);
			bw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
