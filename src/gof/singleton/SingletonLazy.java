package gof.singleton;

/**
 * Singleton Lazy.
 * @author Gelbcke
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super(); // it will work with or without the super.
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
