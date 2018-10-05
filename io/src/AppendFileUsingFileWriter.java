

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileUsingFileWriter {

	public static void main(String[] args) {
		File file = new File("d://file3.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		String appendTxt = "\nThis text will append";
		try{
			if(!file.exists())
				file.createNewFile();
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write(appendTxt);
			bw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(fw != null)
					fw.close();
				if(bw != null)
					bw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
