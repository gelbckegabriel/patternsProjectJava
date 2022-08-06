package gof.singleton;

/**
 * Singleton Eager "Apressado".
 * @author Gelbcke
 */

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super(); // it will work with or without the super.
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
