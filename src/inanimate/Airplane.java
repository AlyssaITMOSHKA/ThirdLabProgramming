package inanimate;

import inanimate.Material;
import inanimate.Mechanisms;
import human.Pilot;

public class Airplane extends Mechanisms implements Piloted {

    public Airplane(){
        super(Material.METAL);
    }

    private static Pilot pilot;

    @Override
    public String toString() {
        return " самолёт";
    }

    public String beingPiloted(Pilot pilot){
        this.pilot = pilot;
        return pilot.toString() + " у штурвала.";
    };

}
