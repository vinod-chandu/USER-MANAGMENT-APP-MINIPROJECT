package com.user.info.Controller;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.sun.istack.logging.Logger;
import com.user.info.Entity.UserRegesiter;
import com.user.info.Repository.Implements.UserServiceImpal;

@Controller
public class UserRegisterController {
	@Autowired
	private UserServiceImpal userServiceImpal;
	@Autowired
	private UserRegesiter userRegesiter;

	private static Integer randomInt;

	private Logger logger = Logger.getLogger(UserRegisterController.class);

	@SuppressWarnings("/UserRegist")
	public String UserRegisterController() {
		logger.info("HELLO PLEASE GO TO WELCOME PAGE");
		return "welcome";
	}

	@PostMapping("/signinData")
	public String cheackingCredantials() {
		logger.info("I AM IN THE CREDANTILAS PAGE");

		String email = userRegesiter.getEmail();
		String userPassword = userRegesiter.getUserPassword();
		if (email.equalsIgnoreCase(email) && email.contains("") && email.isEmpty()) {
			return "welcome";
		} else if (userPassword.contains(null) && userPassword.isBlank()) {
			logger.info("SORRU YOUR password is not correct");
			return "welcome";
		} else {
			userServiceImpal.isEmailIdAndPassword(email, userPassword);
			return "sucesspage";
		}
	}

	@PostMapping("/unlockPage")
	private String unlockPage(@ModelAttribute("udata") @Valid UserRegesiter userRegesiter, Model model, Errors errors) {
		logger.info("I AM CHEACKING USER ENTERED FORM DATA");

		if (errors.hasErrors()) {
			logger.info("sorry creadantials is not satisfied please go through the valid credantials");
			return "sorry this credantilas are invalid" + "signUp";
		} else {
			logger.info("YOU ARE ENTERED VALID CREDANTIALS");
			userServiceImpal.saveUser(userRegesiter);
			return "welcome";
		}

	}

	@PostMapping("/userData")
	private String gettingUserData(@ModelAttribute("udata") @Valid UserRegesiter userRegesiter, Model model,
			Errors errors) {
		logger.info("I AM CHEACKING USER ENTERED FORM DATA");

		if (errors.hasErrors()) {
			logger.info("sorry creadantials is not satisfied please go through the valid credantials");
			return "sorry this credantilas are invalid" + "signUp";
		} else {
			logger.info("YOU ARE ENTERED VALID CREDANTIALS");
			userServiceImpal.saveUser(userRegesiter);
			return "you are succesfully";
		}

	}

	@GetMapping("/forgotpassword")
	private String getUserFormData() {
		Random random = new Random(System.nanoTime());

		randomInt = random.nextInt(1000000000);
		/**
		 * HERE MAIL CODE I WANT TO WRITE HERE I WILL WRITE THE MAIL CODE LOGIC HERE
		 * 
		 */
		return "mailPage";

	}

	@PutMapping("/")
	private String updateUserRegisterData() {
		return null;

	}

	@DeleteMapping("")
	private String DeleteData() {
		return null;

	}

}