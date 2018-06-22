package org.koaksoft.avalon.input;

import java.util.Scanner;

/**
 * base input reader
 * 
 * @author mariafarooq
 *
 */
public class BaseInputReader implements InputReader {

    private final Scanner scanner;

	public BaseInputReader(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public String readString() {
		return scanner.nextLine();
	}

	public int readInt() {
		return Integer.parseInt(scanner.nextLine());
	}

}
