package com.beans.erp.controller;

import com.beans.erp.model.User;
import com.beans.erp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
		User user = userRepository.findByUsernameAndPassword(username, password);

		if (user != null) {
			return "redirect:/beans_erp";
		} else {
			model.addAttribute("error", "Invalid username or password");
			return "login";
		}
	}

	@GetMapping("/beans_erp")
	public String showBeansErpPage() {
		return "beans_erp";
	}
}
