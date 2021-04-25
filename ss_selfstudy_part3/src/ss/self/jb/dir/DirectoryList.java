/**
 * 
 */
package ss.self.jb.dir;

import java.io.File;

/**
 * List all files and subdirectories within a given directory
 * 
 * @author Ryan Knapp
 *
 */
public class DirectoryList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Music directory in project folder
		String musicDir = "Music/";

		listFiles(musicDir);
	}

	// method that recursively loops through given directory for all
	// files/directories
	public static void listFiles(String startDir) {
		// declaring variables
		File dir = new File(startDir);
		File[] files = dir.listFiles();

		// enhanced for loop to loop through files array
		for (File file : files) {
			// if the file is a directory
			if (file.isDirectory()) {
				// print the directory name
				System.out.println(file.getName());
				// recursively call the method to loop through the new directory
				listFiles(file.getAbsolutePath());
			} else {
				System.out.println(file.getName());
			}
		}
	}

}
