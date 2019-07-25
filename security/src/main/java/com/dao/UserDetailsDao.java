package com.dao;

import entity.User;

public interface UserDetailsDao {
	
	User findUserByUsername(String username);
	
}
