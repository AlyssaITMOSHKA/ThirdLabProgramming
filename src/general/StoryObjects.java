package general;

public abstract class StoryObjects {
    private Appearance[] appearance;

    public Appearance[] getAppearance(){
        return appearance;
    }

    public StoryObjects(){
        appearance = new Appearance[] {};
    }

    public StoryObjects(Appearance[] a){
        this.appearance = a;
    }





}
