package es.dsw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value= {"/","index", "index.html"})
	public String index() {
		return "index";
	}
	
	@GetMapping(value={"/step1", "views/step1", "views/step1.html"})
	public String step1() {
		return "views/step1";
	}
	
	@GetMapping(value={"/step2", "views/step2.html"})
	public String step2() {
		return "views/step2";
	}
	
	@GetMapping(value= {"/step3", "views/step3.html"})
	public String step3() {
		return "views/step3";
	}

	@GetMapping(value= {"/step4", "views/step4.html"})
	public String step4() {
		return "views/step4";
	}
	
	@GetMapping(value= {"/end", "views/end.html"})
	public String end() {
		return "views/end";
	}
}
