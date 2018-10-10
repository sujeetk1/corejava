package strategy;

import java.io.File;
import java.util.ArrayList;


/**
 * 
 * @author sujeetk1
 *
 */
public class ZipCompressionStrategy implements CompressStrategy{

	@Override
	public void archiveFile(ArrayList<File> files) {
		System.out.println("Files compressed as ZIP");
		
	}

}
