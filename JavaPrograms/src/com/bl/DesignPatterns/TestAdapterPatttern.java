package com.bl.DesignPatterns;

public class TestAdapterPatttern {

	public static void main(String[] args)
	{
		testClassAdapter();
		testObjectAdapter();

	}

	private static Volts getVolt(Adapter s, int i) {
		switch (i){
		case 3: return s.get3Volts();
		case 12: return s.get20Volts();
		case 120: return s.get120Volts();
		default: return s.get120Volts();
		}
	}
	private static void testObjectAdapter()
	{
		ObjectAdapter s = new ObjectAdapter();
		Volts v3 = getVolt(s,3);
		Volts v12 = getVolt(s,12);
		Volts v120 = getVolt(s,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}

	public static void testClassAdapter()
	{
		SocketAdapter sockAdapter = new SocketAdapter();
		Volts v3 = getVolt(sockAdapter,3);
		Volts v12 = getVolt(sockAdapter,12);
		Volts v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
}



