package com.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItems();

		System.out.println("Total Cost: " + vegMeal.getCost()+"\n");
		
		Meal nonveg =mealBuilder.perpareNonvegmeal();
		System.out.println("Nonveg Meal");
		nonveg.showItems();
		System.out.println("Total cost: "+nonveg.getCost());
		
		

	}

}