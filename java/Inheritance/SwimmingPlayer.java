package Inheritance;

public class SwimmingPlayer extends Player{
    @Override
    public void play(){
        System.out.println("I'm swimming");
    }
    @Override
    public void participateCompetition(){
        System.out.println("participate in a swimming competition");
    }
}
