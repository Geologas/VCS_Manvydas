package lt.vcs.manvydas.printer;

import java.util.Scanner;

public class PrinterMain {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
//		
//		System.out.println("Input file name:");
//		Scanner sc = new Scanner(System.in);
//		String fileName = sc.nextLine();
//		printer.findAndPrintFile(fileName);
//		
		
		printer.copyAndRenameFile("File.txt", "NewFile.txt");
	}

}
