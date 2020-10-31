package com.company.drink;

import com.company.drink.Drink;

public final class Juice extends Drink {
    private String fruitMadeFrom;
    private static final String DESCRIPTION_TEMPLATE = "%s, %s, made from %s.";

    public Juice(String name, boolean isCarbonated, String fruitCreatedFrom) {
        super(name, isCarbonated);
        this.fruitMadeFrom = fruitCreatedFrom;
    }

    @Override
    public String getDescription() {
        String carbonatedDisplay = super.getCarbonatedDisplay();
        String description = String.format(
                DESCRIPTION_TEMPLATE, getName(), carbonatedDisplay, fruitMadeFrom
        );

        return description;
    }

    public String getFruitMadeFrom() {
        return fruitMadeFrom;
    }

    public void setFruitMadeFrom(String fruitMadeFrom) {
        this.fruitMadeFrom = fruitMadeFrom;
    }
}
