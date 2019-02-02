package com.bl.DesignPatterns;
import com.bl.DesignPatterns.Computer;
import com.bl.DesignPatterns.ComputerFactory;

public class TestComputerFactory {

	public static void main(String[] args)
	{
		Computer pc = ComputerFactory.getComputer("PC", "4 gb", "1tb", "octaCore");
		Computer Server = ComputerFactory.getComputer("Server", "32gb", "3tb", "HexaCore");
		Computer Server1 = ComputerFactory.getComputer("Server", "4gb", "22gb", "3.4Ghz");
		
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+Server);
		System.out.println("Fctory Server config ::"+Server1);
	}
	
}
