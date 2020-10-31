package com.company;

import com.company.drink.Beer;
import com.company.drink.Drink;
import com.company.drink.Juice;
import com.company.drink.Soda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Juice orangeJuice = new Juice("Orange Juice", false, "oranges");
        Beer budweiser = new Beer("Budweiser", true, 0.05);
        Soda pepsi = new Soda("Pespi", true);

        List<Drink> drinkArray = new ArrayList<>(Arrays.asList(orangeJuice, budweiser, pepsi));
        drinkArray.forEach(drink -> System.out.println(drink.getDescription()));
    }
}
