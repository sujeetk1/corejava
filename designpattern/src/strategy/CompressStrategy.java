package strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * 
 * @author sujeetk1
 *
 */
public interface CompressStrategy {
	public void archiveFile(ArrayList<File> files);
}
