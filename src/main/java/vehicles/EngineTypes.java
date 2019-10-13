package vehicles;

public enum EngineTypes implements VehicleSpecifics{

    DIESEL("Diesel"),
    PETROL("Petrol"),
    HYBRID("Hybrid"),
    ELECTRIC("Electric");


    private final String description;


    EngineTypes(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
