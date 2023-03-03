package com.canddella.flightreservation.controllers;

import com.canddella.flightreservation.entities.User;
import com.canddella.flightreservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage()
	{

		return "login/RegisterUser";
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user)
	{
		userRepository.save(user);
		return "login/login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(@RequestParam("username")String email, @RequestParam("password")String password,ModelMap modelMap) {
		
		User user = userRepository.findByEmail(email);
		if(user.getPassword().equals(password))
		{
			return "login/findFlights";
		}
		else
		{
			modelMap.addAttribute("msg","Invalid username or password, retry");
			return "login/login";
		}
		
		}
}