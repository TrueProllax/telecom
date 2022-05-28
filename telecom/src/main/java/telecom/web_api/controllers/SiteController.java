
package telecom.web_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteController {
    
    @GetMapping("/")
    public String Index (Model model) {
	model.addAttribute("title", "Главная страница");
	return "Index";
    }
        
//    @GetMapping("/about")
//    public String about(Model model) {
//	model.addAttribute("title", "Про нас");
//	return "about";
//    }
}
