package com.qa;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

public class World {

	@Inject
	public Message message;
	
	public String run() {

		String mess = message.message();
		return mess;
	}
	
}
