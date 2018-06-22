package org.koaksoft.avalon.out;

import java.io.PrintStream;

/**
 * @author mariafarooq
 *
 */
public class BaseOutputWriter implements OutputWriter {

	private final PrintStream printStream;

	public BaseOutputWriter(PrintStream printStream) {
		super();
		this.printStream = printStream;
	}

	public void print(String message) {
		printStream.print(message);
	}

}
