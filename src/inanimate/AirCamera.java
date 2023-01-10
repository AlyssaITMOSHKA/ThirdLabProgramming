package inanimate;

public class AirCamera extends Mechanisms implements PhotoMaker {


    public AirCamera() {
        super(Material.METAL);
    }

    @Override
    public String toString() {
        return " аэрокамера";
    }

    public String makePhoto(){
        return "Щёлкает" + this.toString() + ". ";
    }
}
