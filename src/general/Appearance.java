package general;

public enum Appearance {
    DARK("мрачно"),
    MYSTERIOUS("загадочно"),
    GEOMETRICALY_RIGHT("геометрически правильно"),
    SCARY("жутко"),
    EXCITING("чарующе"),
    WIND_WEATHERED("подвергнуто влиянию ветра");


    private String appearance;

    Appearance(String appearance){
        this.appearance = appearance;
    }
    public String getAppearance(){
        return appearance;
    }
}


