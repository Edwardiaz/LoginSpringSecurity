package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public class UserDetailsDaoImp implements UserDetailsDao {
	
    @Autowired
    private SessionFactory sessionFactory;
	
	
	@Override
	public User findUserByUsername(String username) {
		
		return sessionFactory.getCurrentSession().get(User.class, username);
	}
}
