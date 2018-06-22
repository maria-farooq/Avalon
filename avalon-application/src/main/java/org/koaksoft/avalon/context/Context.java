package org.koaksoft.avalon.context;

import java.util.Hashtable;

/**
 * Simple context implementation
 * 
 * @author mariafarooq
 *
 */
public class Context {

	/**
	 * context attributes.
	 */
	protected Hashtable<String, Object> myAttributes;

	public Context() {

		this.myAttributes = new Hashtable<String, Object>();

	}

	/**
     * Return the specified context attribute, if any.
     *
     * @param name Name of the requested attribute
     */
    public Object getAttribute(String name) {

        return (myAttributes.get(name));

    }

    /**
	 * Set or replace the specified context attribute.
	 *
	 * @param name
	 *            Name of the context attribute to set
	 * @param value
	 *            Corresponding attribute value
	 */
	public void setAttribute(String name, Object value) {

		myAttributes.put(name, value);

	}

	/**
	 * Remove the specified context attribute.
	 *
	 * @param name
	 *            Name of the attribute to remove
	 */
	public void removeAttribute(String name) {

		myAttributes.remove(name);

	}

}
