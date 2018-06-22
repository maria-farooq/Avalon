package org.koaksoft.avalon.application;

import org.koaksoft.avalon.context.Context;

public class Application {

	public static void main( String[] args ) {
		Context context = new Context();
    	Bootstrapper bootstrapper = new Bootstrapper(context);
    	bootstrapper.init();
    }
}
