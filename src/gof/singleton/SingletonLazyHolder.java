package gof.singleton;

/**
 * Singleton "Lazy Holder" - The holder of the instance.
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 * @author Gelbcke
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
    public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super(); // it will work with or without the super.
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }

}
