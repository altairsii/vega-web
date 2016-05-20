package com.vega.web.turnkey.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute("user") ModelMap model) {
		return "freemarker/helloword";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(@ModelAttribute("user") ModelMap model) {
		return "freemarker/helloword";
	}

	@RequestMapping(value = "/queryserver", method = RequestMethod.GET)
	public String queryserver(@ModelAttribute("user") ModelMap model) {
		return "queryserver";
	}
}
