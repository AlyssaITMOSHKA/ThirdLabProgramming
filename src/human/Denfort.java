package human;

import human.Human;
import human.Pilot;
import inanimate.Piloted;

public class Denfort extends Human implements Pilot {

    public Denfort() {
        super("Денфорт");
    }

    @Override
    public void piloting(Piloted piloted){
        System.out.println(piloted.beingPiloted(this));
        System.out.println(getName() + " хороший пилот.");
    }

}


