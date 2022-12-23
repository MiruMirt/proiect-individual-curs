package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerPage {
	@Autowired
	private PictorRepository pictorRepository;
	@Autowired
	private TablouRespository tablouRepository;

	@GetMapping("/tablouri")
	public String paintings(Model model) {
		model.addAttribute("tablouri",tablouRepository.findAll());
		return "tablouri";
	}
	@GetMapping("/pictori")
	public String explorers(Model model) {
		model.addAttribute("pictori", pictorRepository.findAll());
		return "pictori";
	}
	@GetMapping("/addPictor")
	public String addPictor(Model model) {
		model.addAttribute("pictor", new Pictor());
		return "addPictor";

	}
	@GetMapping("/addTablou")
	public String addTablou(Model model) {
		model.addAttribute("tablou", new Tablou());
		return "addTablou";

	}
	@PostMapping("/createTablou")
	public String createTablou(@ModelAttribute Tablou tablou, Model model) {
		model.addAttribute("tablou", tablou);
		tablouRepository.save(tablou);
		return "redirect:tablouri";
	}
	@PostMapping("/createPictor")
	public String createTablou(@ModelAttribute Pictor pictor, Model model) {
		model.addAttribute("pictor", pictor);
		pictorRepository.save(pictor);
		return "redirect:pictori";
	}
	public TablouRespository getTablouRepository() {
		return tablouRepository;
	}
	public void setTablouRepository(TablouRespository tablouRepository) {
		this.tablouRepository = tablouRepository;
	}
	public PictorRepository getPictorRepository() {
		return pictorRepository;
	}
	public void setPictorRepository(PictorRepository pictorRepository) {
		this.pictorRepository = pictorRepository;
	}
}
