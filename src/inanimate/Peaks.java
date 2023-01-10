package inanimate;

import general.Appearance;

public class Peaks extends LandscapeElement {

    public Peaks() {
        super(Material.STONE, new Appearance[]{Appearance.DARK, Appearance.MYSTERIOUS, Appearance.WIND_WEATHERED, Appearance.EXCITING});
    }

    @Override
    public String toString() {
        return " горные вершины";
    }

    public void clingedby(ClingPeaks clingPeaks){
        clingPeaks.clingToPeaks();
    }



}
