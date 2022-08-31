package site.metacoding.yellow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	// 보통은 "/"쓰지만 "/index" "/yellow"
	public String index() {
		return "index";
	}

}
