package strategy;

/**
 * 
 * @author sujeetk1
 *
 */
import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	CompressStrategy strategy = null;
	
	public void setCompressStrategy(CompressStrategy strategy){
		this.strategy = strategy;
	}
	
	public void archiveFiles(ArrayList<File> files){
		strategy.archiveFile(files);
	}
}
