package com.bl.DesignPatterns;

public class SocketAdapter extends Socket implements Adapter {

	@Override
	public Volts get120Volts() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volts get20Volts() {
		// TODO Auto-generated method stub
		Volts v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volts get3Volts() {
		// TODO Auto-generated method stub
		Volts v= getVolt();
		return convertVolt(v,40);
	}
	private Volts convertVolt(Volts v, int i) {
		return new Volts(v.getVolts()/i);

	
}
}
