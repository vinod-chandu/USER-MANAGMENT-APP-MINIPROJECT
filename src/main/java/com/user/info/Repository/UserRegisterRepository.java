package com.user.info.Repository;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.info.Entity.UserRegesiter;

@Repository
public interface UserRegisterRepository extends JpaRepository<UserRegesiter, Serializable> {

	
	public String findByEmailIdAndUserPassword(String password,String emailId);
}
