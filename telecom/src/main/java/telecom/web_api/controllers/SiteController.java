
package telecom.web_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SiteController {
    
    @GetMapping("/")
    public String index (Model model) {
	model.addAttribute("title", "Главная страница");
	return "index";
    }
    
    @GetMapping("/news")
    public String news (Model model) {
	//model.addAttribute("title", "Главная страница");
	return "news";
    }
    
    @GetMapping("/request")
    public String request (Model model) {
	//model.addAttribute("title", "Главная страница");
	return "request";
    }
    
    @GetMapping("/tariff")
    public String tariff (Model model) {
	//model.addAttribute("title", "Главная страница");
	return "tariff";
    }
    
    @GetMapping("/authorization")
    public String Authorization (Model model) {
	//model.addAttribute("title", "Автори");
	return "authorization";
    }
    
}
