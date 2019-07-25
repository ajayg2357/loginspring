package com.cg.login;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	ArrayList<String> cityList;
	ArrayList<String> skillList;

	@Autowired
	Login login;

	@RequestMapping(value = "/showForm", method = RequestMethod.GET)
	public String loginPage(Model model) {
		model.addAttribute("login", login);
		return "login";

	}

	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public String CheckLoginPage(Login login, Model model) {

		cityList = new ArrayList<String>();

		cityList.add("chennai");
		cityList.add("rajahmundry");
		cityList.add("hyd");
		cityList.add("mumbai");
		cityList.add("pune");

		skillList = new ArrayList<String>();

		skillList.add("java");
		skillList.add("angular");
		skillList.add("spring");
		skillList.add("boot");
		skillList.add("asdf");

		if (login.getUserName().equals("admin")) {

			model.addAttribute("cityList", cityList);
			model.addAttribute("skillList", skillList);

			model.addAttribute("register", new Register());
			return "register";
		} else
			return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPage(@ModelAttribute("register") @Valid Register register, Model model,
			BindingResult result) {

		if (result.hasErrors()) {

			model.addAttribute("cityList", cityList);
			model.addAttribute("skillList", skillList);
			model.addAttribute("register", register);

			return "register";
		}
		model.addAttribute("cityList", cityList);
		model.addAttribute("skillList", skillList);
		model.addAttribute("register", register);

		return "success";

	}

}
