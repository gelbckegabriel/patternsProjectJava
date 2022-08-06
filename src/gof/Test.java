package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

public class Test {

    public static void main (String[] args) {

            // Singleton.

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        System.out.println("-------------------------------");

            // Strategy.
        Behaviour defensive = new DefensiveBehaviour();
        Behaviour normal = new NormalBehaviour();
        Behaviour aggressive = new AgressiveBehaviour();

        Robot robot = new Robot();
        robot.setStrategy(aggressive);
        robot.move();
        robot.move();

        robot.setStrategy(normal);
        robot.move();

        System.out.println("-------------------------------");

            // facade.
        Facade facade = new Facade();
        facade.migrateClient("Gelbcke", "65872-999");

    }

}
