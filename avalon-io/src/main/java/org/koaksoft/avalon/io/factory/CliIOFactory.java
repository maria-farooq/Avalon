package org.koaksoft.avalon.io.factory;

import java.util.Scanner;

import org.koaksoft.avalon.input.BaseInputReader;
import org.koaksoft.avalon.io.IOManager;
import org.koaksoft.avalon.out.BaseOutputWriter;

/**
 * @author mariafarooq
 *
 */
public class CliIOFactory implements IOFactory {

	public IOManager provideIOManager() {
		return new IOManager(new BaseOutputWriter(System.out), new BaseInputReader(new Scanner(System.in)));
	}

}
