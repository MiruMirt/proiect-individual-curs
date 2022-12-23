package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPage {
	@Autowired
	private PictorRepository pictorRepository;
	@Autowired
	private TablouRespository tablouRepository;

	@GetMapping("/tablouri")
	public String paintings(Model model) {
		model.addAttribute("tablouri", TablouRespository.findAll());
		return "tablouri";
	}
	@GetMapping("/pictori")
	public String painters(Model model) {
		model.addAttribute("pictori", PictorRepository.findAll());
		return "pictori";
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
