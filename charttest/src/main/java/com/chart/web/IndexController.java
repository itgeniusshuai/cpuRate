package com.chart.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/toChart")
	public String toChart(){
		return "showCpuRate";
	}
	@RequestMapping("/toServerList")
	public String toServerList(){
		return "redirect:";
	}
}
