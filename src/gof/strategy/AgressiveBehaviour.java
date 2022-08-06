package gof.strategy;

public class AgressiveBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("Moving aggressively...");
    }

}
