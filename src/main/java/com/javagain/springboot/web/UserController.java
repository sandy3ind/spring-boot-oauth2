package com.javagain.springboot.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javagain.springboot.model.User;

/**
 * 
 * @author Sandeep.Sharma
 *
 */
@RestController
public class UserController {
	/**
	 * Return list of users
	 * 
	 * @return
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = populateDummyUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
	
	/**
	 * Populate Dummy data of users
	 * 
	 * @return
	 */
	private static List<User> populateDummyUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Sam",30, 70000));
		users.add(new User(2,"Tom",40, 50000));
		users.add(new User(3,"Jerome",45, 30000));
		users.add(new User(4,"Silvia",50, 40000));
		return users;
	}
}
