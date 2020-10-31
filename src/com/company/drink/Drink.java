package com.company.drink;

public class Drink {
    private String name;
    private boolean isCarbonated;

    public Drink(String name, boolean isCarbonated) {
        this.name = name;
        this.isCarbonated = isCarbonated;
    }

    public String getDescription() {
        String carbonatedDisplay = getCarbonatedDisplay();
        String description = String.format("%s, %s.", name, carbonatedDisplay);

        return description;
    }

    public String getCarbonatedDisplay() {
        String carbonatedDisplay = isCarbonated ? "carbonated" : "not carbonated";
        return carbonatedDisplay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCarbonated() {
        return isCarbonated;
    }

    public void setCarbonated(boolean carbonated) {
        isCarbonated = carbonated;
    }
}
