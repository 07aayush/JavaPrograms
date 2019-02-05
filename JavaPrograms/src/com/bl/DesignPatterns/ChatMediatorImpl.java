package com.bl.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	public ChatMediatorImpl(){
		this.users=new ArrayList<>();
	}
		
	@Override
	public void sendMessage(String msg, User user) {
		// TODO Auto-generated method stub
		for(User u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
	}

	

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);

	}

}
