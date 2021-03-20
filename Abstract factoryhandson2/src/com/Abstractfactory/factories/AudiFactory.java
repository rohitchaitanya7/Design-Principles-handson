package com.Abstractfactory.factories;

public class AudiFactory extends Factory{
	Headlight h = new AudiHeadlight();

	@Override
	public String makeHeadLight() {
		// TODO Auto-generated method stub
		return h.hedlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
