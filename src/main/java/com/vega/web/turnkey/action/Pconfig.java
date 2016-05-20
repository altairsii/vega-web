package com.vega.web.turnkey.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vega.web.turnkey.model.PConfig;
import com.vega.web.turnkey.service.PConfigService;

/**
 * 配置管理action
 * @author wangyongbing
 *
 */
@Controller
public class Pconfig {

	@Autowired
	private PConfigService pconfigService;

	@RequestMapping(value = "/pconfig", method = RequestMethod.GET)
	public String index(@ModelAttribute("model") ModelMap model) {
		List<PConfig> pconfigList = pconfigService.getAllPConfig();
		model.addAttribute("pconfigList", pconfigList);
		return "index";
	}
}
