package com.bl.DesignPatterns;

public class ObjectAdapter implements Adapter {

	private Socket sock = new Socket();

	@Override
	public Volts get120Volts() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volts get20Volts() {
		// TODO Auto-generated method stub
		Volts v= sock.getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volts get3Volts() {
		// TODO Auto-generated method stub
		Volts v= sock.getVolt();
		return convertVolt(v,40);
	}
	
	private Volts convertVolt(Volts v, int i) {
		return new Volts(v.getVolts()/i);
	}
	}
	
	

