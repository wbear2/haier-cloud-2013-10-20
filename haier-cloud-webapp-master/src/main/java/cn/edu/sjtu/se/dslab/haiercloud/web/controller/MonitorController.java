package cn.edu.sjtu.se.dslab.haiercloud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MonitorController {
	
	@RequestMapping(value= "/monitor", method = RequestMethod.GET)
	public String test() {
		
		return "/monitor";
	}
}
