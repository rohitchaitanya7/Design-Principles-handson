package com.adepter;

public class CorrencyAdapterImpl implements Doller {
	private Rupees rs; 
	// standard constructors


	public CorrencyAdapterImpl(Rupees rs) {
		super();
		this.rs = rs;
	}
	



	private double convertDollertoRs(double doller) {
		return doller * 75;
	}


	@Override
	public double getconvert() {
		// TODO Auto-generated method stub
		return convertDollertoRs(rs.getconvert());
	}

}