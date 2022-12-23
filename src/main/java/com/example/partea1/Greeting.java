package com.example.partea1;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
	

	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("message", "Salutare");
		return "Helloo";
	}
}
