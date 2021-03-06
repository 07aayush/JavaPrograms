package com.bl.DesignPatterns;

public class CommandExecuterProxy implements CommandExecuter {
	
	private boolean isAdmin;
	private CommandExecuter executor;
	
	public CommandExecuterProxy(String user, String pwd){
		if("Aayush".equals(user) && "J@urnalD$v".equals(pwd)) isAdmin=true;
		executor = new CommandExecuterImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
	}


}
