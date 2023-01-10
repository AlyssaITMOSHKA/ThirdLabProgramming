import inanimate.Peaks;
import human.*;
import inanimate.*;

public class Main {
    public static void main(String[] args) {

        Denfort denfort = new Denfort();
        Storyteller storyteller = new Storyteller();
        Airplane airplane = new Airplane();
        AirCamera airCamera = new AirCamera();
        Binoculars binoculars = new Binoculars();
        Construction construction = new Construction();
        Peaks peaks = new Peaks();
        storyteller.bePassanger(airplane);
        denfort.bePassanger(airplane);
        storyteller.watch(peaks);
        denfort.piloting(airplane);
        storyteller.lookThrough(binoculars);
        storyteller.usePhotomaker(airCamera);
        storyteller.piloting(airplane);
        denfort.lookThrough(binoculars);
        denfort.watch(construction);
        denfort.analizeMaterial(construction);



//        den.piloting(airplane); 1123131906
//        storyteller.piloting(airplane);
//        System.out.println(den.getName());
//        den.lookThrough();
//        den.watch(new inanimate.Peaks());
//        den.usePhotomaker(new inanimate.AirCamera());
    }
}




