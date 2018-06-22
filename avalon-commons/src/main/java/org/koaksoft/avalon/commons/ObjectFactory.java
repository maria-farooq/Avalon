package org.koaksoft.avalon.commons;

/**
 * @author mariafarooq
 *
 */
public final class ObjectFactory {

	private final ClassLoader classLoader;

    public ObjectFactory() {
        super();
        classLoader = getClass().getClassLoader();
    }

    public Object getObjectInstance(final String name) throws InstantiationException {
        try {
            final Class<?> klass = classLoader.loadClass(name);
            return klass.newInstance();
        } catch (final Exception exception) {
            throw new InstantiationException(exception.getMessage());
        }
    }
}