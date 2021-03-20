package com.Abstractfactory.factories;

public class Client {

	public static void main(String[] args){
		
		Factory mfactory=new MercedesFactory();
		System.out.println(mfactory.makeHeadLight());
		System.out.println(mfactory.makeTire());
		
		Factory audiFactory=new AudiFactory();
		System.out.println(audiFactory.makeHeadLight());
		System.out.println(audiFactory.makeTire());
		
	}
}
