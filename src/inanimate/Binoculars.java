package inanimate;

import inanimate.Material;
import inanimate.Mechanisms;

public class Binoculars extends Mechanisms {

    public Binoculars() {
        super(Material.METAL);
    }

    @Override
    public String toString() {
        return " бинокль";
    }
}
