/**
 * 
 */
package ss.self.jb.count;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * count how many times a given character appears in a file
 * 
 * @author Ryan Knapp
 *
 */
public class CharCount {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// scanner for user input
		Scanner sc = new Scanner(System.in);

		// file to read from
		FileReader fr = new FileReader("Music/Concert List.txt");

		// collecting user input
		System.out.println("Character to look for: ");
		String userInput = sc.nextLine();

		// validating user input
		if (userInput.length() == 1) {
			// convert userInput to char
			char charInput = userInput.charAt(0);

			// print amount of times input character is in file
			System.out.println(charInFile(fileToString(fr), charInput));
		} else {
			// if userInput is not a char
			System.out.println("Input was not a single character.");
		}

		// close scanner
		sc.close();
	}

	// method to count the amount of times a char appears in given string
	public static String charInFile(String text, char charToFind) {
		int count = 0;

		// counts character for both upper and lower case
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == Character.toLowerCase(charToFind)
					|| text.charAt(i) == Character.toUpperCase(charToFind)) {
				count++;
			}
		}

		// return string
		return "The character " + charToFind + " was found " + count + " times.";

	}

	// method to turn file into string using BufferedReader and StringBuilder
	public static String fileToString(FileReader file) throws IOException {
		// string for storing the contents of the file as a string
		String fileContents;

		// try catch using BufferedReader to turn bytes into a String with StringBuilder
		try (BufferedReader br = new BufferedReader(file)) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			// reads to the end of the file
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();

			}
			fileContents = sb.toString();
		}
		// return string
		return fileContents;
	}

}
