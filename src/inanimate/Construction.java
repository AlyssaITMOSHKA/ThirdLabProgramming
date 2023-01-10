package inanimate;

import general.*;

public class Construction extends LandscapeElement implements ClingPeaks {

    public void clingToPeaks(){
        System.out.println("К горным вершинам приклеены" + this.toString() + ".");
    }

    public Construction() {
        super(Material.LIGHTQUARTZITE, new Appearance[] {Appearance.SCARY, Appearance.MYSTERIOUS, Appearance.GEOMETRICALY_RIGHT});
    }

    @Override
    public String toString() {
        return " конструкции";
    }
}



