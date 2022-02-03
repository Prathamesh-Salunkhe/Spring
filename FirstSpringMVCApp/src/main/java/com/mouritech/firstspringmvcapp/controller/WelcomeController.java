package com.mouritech.firstspringmvcapp.controller;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mouritech.firstspringmvcapp.model.Welcome;

@Controller
@RequestMapping("welcomecontroller")
public class WelcomeController {
	
	@RequestMapping("/saywelcome")
	public String greetingHandler(Model model) {
	
		 Welcome welcome=new Welcome();
		 welcome.setDateTime(LocalDateTime.now().toString());
		 model.addAttribute("welcomeobj",welcome);
		 return "welcome";
	}

}



