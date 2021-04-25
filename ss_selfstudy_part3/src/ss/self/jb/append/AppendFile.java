/**
 * 
 */
package ss.self.jb.append;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Append text onto an existing file through the file io system
 * 
 * @author Ryan Knapp
 *
 */
public class AppendFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// scanner to get user input
		Scanner sc = new Scanner(System.in);

		// try catch for FileWriter
		try {
			// FileWriter set to append
			FileWriter fw = new FileWriter("Music/Concert List.txt", true);

			System.out.println("Append Following to Concert List.txt:");

			// getting user input
			String userInput = sc.nextLine();

			// writing user input to Concert List.txt
			fw.write("\n" + userInput);
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
