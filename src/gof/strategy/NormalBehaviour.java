package gof.strategy;

public class NormalBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("Moving constantly...");
    }

}
