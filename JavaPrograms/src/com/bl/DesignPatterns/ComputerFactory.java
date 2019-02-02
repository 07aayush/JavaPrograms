package com.bl.DesignPatterns;

import com.bl.DesignPatterns.Computer;
import com.bl.DesignPatterns.PC;
import com.bl.DesignPatterns.Server;

public class ComputerFactory {

public static Computer getComputer(String type ,String ram,String hdd,String cpu)
{
	if("PC".equalsIgnoreCase(type)) 
	return new PC(ram,hdd,cpu);
	else if("Server".equalsIgnoreCase(type))
	return new Server(ram,hdd,cpu);

	return null;
	
}

}


