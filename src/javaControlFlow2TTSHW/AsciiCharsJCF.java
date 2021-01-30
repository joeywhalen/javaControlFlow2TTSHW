package javaControlFlow2TTSHW;

public class AsciiCharsJCF {

	public static void printNumbers() {
	    // TODO: print valid numeric input
		// ASCii numbers range = 48 to 57
		for(int n = 48; n < 58; n++) {
			System.out.printf("%c, ", n);
		}
		System.out.printf("\n");
		// adds a new line
	  }

	  public static void printLowerCase() {
	    // TODO: print valid lowercase alphabetic input
		// ASCii numbers range = 97 to 122
		for(int l = 97; l < 123; l++) {
			System.out.printf("%c, ", l);
		}
		System.out.printf("\n");
		// adds a new line
	  }

	  public static void printUpperCase() {
	    // TODO: print valid uppercase alphabetic input
		// ASCii numbers range = 65 to 90
		for(int u = 65; u < 91; u++) {
			System.out.printf("%c ", u);
		}
		System.out.printf("\n");
		// adds a new line
	}

}
