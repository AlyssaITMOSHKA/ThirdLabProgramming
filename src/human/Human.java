package human;

import inanimate.*;
import general.*;
import java.util.Arrays;

public abstract class Human extends StoryObjects implements Photographer, Look, Emotional, Passanger {


    private String name;

    @Override
    public void bePassanger(Piloted piloted){
        System.out.println(this.toString() + " внутри" + piloted.toString() + "а. ");

    }

    @Override
    public String toString() {
        return this.name;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(Appearance[] a, String name) {
        super(a);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String feelScared(){
        return this.getName() + " ощущает страх.";
    }

    @Override
    public String feelExcited(){
        return this.getName() + " взволнован.";
    }

    @Override
    public void watch(StoryObjects storyObject){
        System.out.println(this.getName() + " смотрит на" + storyObject.toString() + ".");
        if(storyObject.getAppearance().length > 0){
            String appearances = new String();
            for (Appearance a: storyObject.getAppearance()){
                appearances = appearances + a.getAppearance() + ", ";
            }
            appearances = appearances.substring(0, appearances.length()-2);
            System.out.println("Это выглядит " + appearances + ".");
        }

        if (Arrays.asList(storyObject.getAppearance()).contains(Appearance.SCARY)){
            System.out.println(this.feelScared());
        }
        if (Arrays.asList(storyObject.getAppearance()).contains(Appearance.EXCITING)){
            System.out.println(this.feelExcited());
        }

        if (storyObject.getClass() == Peaks.class){
            ((Peaks) storyObject).clingedby(new Caves());
            ((Peaks) storyObject).clingedby(new Cubes());
            ((Peaks) storyObject).clingedby(new Ramparts());
            this.watch(new Construction());

        }

    }

    @Override
    public void lookThrough(Binoculars binoculars){
        System.out.println(this.getName() + " смотрит в" + binoculars.toString() + ".");
    }

    @Override
    public void usePhotomaker(PhotoMaker photoMaker){
        System.out.println(photoMaker.makePhoto() + this.getName() + " делает снимки.");
    }

    public void analizeMaterial(Inanimate inanimate){
        System.out.println(this.name + " понимает, что основной матриал здесь - " + inanimate.getMaterial().getMaterial());
    }

}



