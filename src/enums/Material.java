package enums;

public enum Material {
    IRON("железное", 250),
    CONCRETE("бетонная", 100),
    SILVERY("серебристая", 200 ),
    FABRIC("тканевая", 30);

    final String name;
    final int endurance;
    Material(String name, int endurance) {
        this.name= name;
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return name;
    }
}

