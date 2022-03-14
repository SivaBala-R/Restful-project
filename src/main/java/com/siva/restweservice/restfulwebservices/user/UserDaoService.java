package com.siva.restweservice.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static  List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Purna", new Date()));
		users.add(new User(2, "Siva", new Date()));
		users.add(new User(3, "Priya", new Date()));
	}
	
	public List<User> findAll(){
		return users;
		
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
		
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
		
	}
	public User deleteById(int id) {
		java.util.Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId()==id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}	

}
