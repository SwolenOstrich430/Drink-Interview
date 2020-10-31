package com.company.drink;

public final class Beer extends Drink {
    private double percentAlcohol;
    private static final String DESCRIPTION_TEMPLATE = "%s, %s, %d%% alcohol";

    public Beer(String name, boolean isCarbonated, double percentAlcohol) {
        super(name, isCarbonated);
        this.percentAlcohol = percentAlcohol;
    }

    @Override
    public String getDescription() {
        String isCarbonatedDisplay = super.getCarbonatedDisplay();
        int percentAlcoholAsInt = getPercentAlcoholAsInt();
        String description = String.format(
                DESCRIPTION_TEMPLATE, getName(), isCarbonatedDisplay, percentAlcoholAsInt
        );

        return description;
    }

    private int getPercentAlcoholAsInt() {
        int percentAlcoholAsInt = (int) (percentAlcohol * 100);
        return percentAlcoholAsInt;
    }

    public double getPercentAlcohol() {
        return percentAlcohol;
    }

    public void setPercentAlcohol(double percentAlcohol) {
        this.percentAlcohol = percentAlcohol;
    }
}
