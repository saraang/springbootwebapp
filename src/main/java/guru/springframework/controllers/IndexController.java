package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    String index(){
        return "index";
    }

    @GetMapping("/login")
	public String login()
	{
		return "login";
	}

}
