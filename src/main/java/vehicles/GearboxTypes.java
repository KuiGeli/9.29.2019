package vehicles;

public enum GearboxTypes implements VehicleSpecifics {


    MANUAL("Manual"),
    AUTOMATIC("Automatic"),
    DOUBLE_CLUTCH("Double clutch")
    ;

    private final String description;

    GearboxTypes(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
