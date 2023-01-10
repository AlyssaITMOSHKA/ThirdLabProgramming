package inanimate;

import general.Appearance;
import general.StoryObjects;

import java.util.Objects;

public class Inanimate extends StoryObjects {

    private Material material;


    public Material getMaterial() {
        return material;
    }


    public Inanimate(Material m){
        this.material = m;
    }

    public Inanimate(Material m, Appearance[] a){
        super(a);
        this.material = m;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inanimate inanimate = (Inanimate) o;
        return (material == inanimate.material) &&
                (getAppearance() == inanimate.getAppearance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, getAppearance());
    }
}
