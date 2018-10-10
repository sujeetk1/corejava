package strategy;

import java.io.File;
import java.util.ArrayList;


/**
 * 
 * @author sujeetk1
 *
 */
public class StrategyClient {

	public static void main(String[] args) {
		CompressionContext context = new CompressionContext();
		
		context.setCompressStrategy(new RarCompressionStrategy());
		
		ArrayList<File> fileList = new ArrayList<>();
		//add files to the list
		
		context.archiveFiles(fileList);
	}

}
