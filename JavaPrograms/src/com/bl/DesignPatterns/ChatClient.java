package com.bl.DesignPatterns;

public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Aayush");
		User user2 = new UserImpl(mediator, "Manju");
		User user3 = new UserImpl(mediator, "Aman");
		User user4 = new UserImpl(mediator, "Sudhkar");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
		
	}

	}

