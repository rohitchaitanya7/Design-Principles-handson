package com.Abstractfactory.factories;

public class MercedesFactory extends Factory {
	Headlight h = new MercedesHeadlight();

	@Override
	public String makeHeadLight() {
		// TODO Auto-generated method stub
		return h.hedlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

}
