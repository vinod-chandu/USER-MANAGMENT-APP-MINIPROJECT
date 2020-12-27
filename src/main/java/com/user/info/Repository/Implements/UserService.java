package com.user.info.Repository.Implements;

import java.util.Map;

import com.user.info.Entity.UserRegesiter;

public interface UserService {
	public Map<Integer, String> findCountary();

	public Map<Integer, String> findState(Integer countaryId);

	public Map<Integer, String> findCity(Integer StateId);

	// cheacking credantials
	public boolean userPassword(Integer userPassWord);

	public boolean saveUser(UserRegesiter userRegesiter);

	public boolean isEmailUnique(String emailId);

	public String isEmailIdAndPassword(String email,String password);

	
}
