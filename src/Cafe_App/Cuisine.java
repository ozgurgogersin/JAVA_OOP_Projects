package Cafe_App;

public enum Cuisine {
    TURKEY("Turkish"),
    INDIA("Indian"),
    US("US"),
    RUSSIA("Russian"),
    ITALY("Italian"),
    ;
    private String name;

    Cuisine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
