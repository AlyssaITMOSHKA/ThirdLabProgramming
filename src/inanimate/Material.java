package inanimate;

public enum Material {
    LIGHTQUARTZITE("лёгкий кварцит"),
    METAL("металл"),
    STONE("камень");

    private String material;

    Material(String material){
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}


