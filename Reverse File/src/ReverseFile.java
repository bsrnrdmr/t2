
// Program to reverse the lines of a file and to reverse the words within
// each line.

import java.io.*;
import java.util.*;

public class ReverseFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("File to reverse? ");
		String inputFile = console.nextLine();
		Scanner input = new Scanner(new File(inputFile));

		ArrayList<String> lines = new ArrayList<String>();
		while (input.hasNextLine()) {
			lines.add(input.nextLine());
		}
		for (int i = lines.size() - 1; i >= 0; i--) {
			printReverse(lines.get(i));
		}
	}

	// prints the words of a String in reverse order
	public static void printReverse(String s) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner input = new Scanner(s);
		while (input.hasNext()) {
			words.add(input.next());
		}
		if (words.size() > 0) {
			System.out.print(words.get(words.size() - 1));
			for (int i = words.size() - 2; i >= 0; i--) {
				System.out.print(" " + words.get(i));
			}
		}
		System.out.println();
	}
}

