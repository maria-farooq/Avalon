package org.koaksoft.avalon.io;

import org.koaksoft.avalon.input.InputReader;
import org.koaksoft.avalon.out.OutputWriter;

/**
 * Manages input and output operations for game interaction
 * 
 * @author mariafarooq
 *
 */
public class IOManager {

	//TODO: implement retry mechanism for invalid input
    private static final int RETRIES = 5;

    private final OutputWriter outputWriter;
    private final InputReader inputReader;

    public IOManager(OutputWriter outputWriter, InputReader inputReader) {
		super();
		this.outputWriter = outputWriter;
		this.inputReader = inputReader;
	}

    /**
     * @return
     */
    public String readInputAsString () {
    	return inputReader.readString();
    }

    /**
     * @param message
     * @return
     */
    public String readInputAsString (final String message) {
    	write(message);
    	return readInputAsString();
    }

    /**
     * @return
     */
    public int readInputAsInt () {
    	return inputReader.readInt();
    }
    
    /**
     * @param message
     */
    public void write (final String message) {
    	outputWriter.print(message);
    }
    
}
