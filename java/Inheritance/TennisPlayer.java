package Inheritance;

public class TennisPlayer extends Player{
    @Override
    public void play(){
        System.out.println("I'm playing tennis");
    }

    @Override
    public void participateCompetition(){
        System.out.println("participate in a tennis competition");
    }
}
