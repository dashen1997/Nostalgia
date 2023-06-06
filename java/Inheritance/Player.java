package Inheritance;

public class Player extends Person implements ParticipateCompetition {

    public void play(){
        System.out.println("play");
    }
    @Override
    public void participateCompetition(){
        System.out.println("participate in a competition");
    }
}
