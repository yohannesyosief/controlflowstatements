package EncapsulationChallenge;

public class Main {

	public static void main(String[] args) {
		//Printer2 printer= new Printer2(50,true);
		Printer2 printer= new Printer2(50,false);

		System.out.println("Initial page count  = "+printer.getPagesPrinted());
		int pagesPrinted=printer.printedPages(4);
		System.out.println("pages print was "+pagesPrinted+" new total print count for printer = "
		+printer.getPagesPrinted());
		pagesPrinted=printer.printedPages(2);
		System.out.println("pages print was "+pagesPrinted+" new total print count for printer = "
				+printer.getPagesPrinted());
		
		
	}

}
