package gof.strategy;

public class DefensiveBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }

}
