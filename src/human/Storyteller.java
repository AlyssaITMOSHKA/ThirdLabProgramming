package human;

import human.Human;
import human.Pilot;
import inanimate.Piloted;

public class Storyteller extends Human implements Pilot {

    public Storyteller(){
        super("Рассказчик");
    }

    @Override
    public void piloting(Piloted piloted){
        System.out.println(piloted.beingPiloted(this));
        System.out.println(getName() + " не очень хорошо владеет штурвалом.");

    }
}



