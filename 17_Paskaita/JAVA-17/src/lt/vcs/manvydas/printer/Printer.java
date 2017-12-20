package lt.vcs.manvydas.printer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Printer {

	public void findAndPrintFile(String fileName) {
		try (FileInputStream in = new FileInputStream(fileName + ".txt")) {
			int data;
			char character;
			while ((data = in.read()) != -1) {
				character = (char) data;
				System.out.print(character);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copyAndRenameFile(String fileName, String newFileName) {

		try {
			try (BufferedReader is = new BufferedReader(new FileReader(fileName));
					BufferedWriter writer = new BufferedWriter(new FileWriter(newFileName))) {
				String line;
				while ((line = is.readLine()) != null) {
					writer.write(line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
