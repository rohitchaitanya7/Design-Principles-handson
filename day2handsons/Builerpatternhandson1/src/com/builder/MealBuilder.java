package com.builder;

public class MealBuilder {

	public Meal prepareVegMeal() {

		Meal meal = new Meal();

		meal.addItem(new VegBurger());

		meal.addItem(new Coke());

		return meal;

	}
	public Meal perpareNonvegmeal() {
		Meal nonveg = new Meal();
		nonveg.addItem(new Pepsi());
		nonveg.addItem(new ChickenBurge());
		return nonveg;
	}

}