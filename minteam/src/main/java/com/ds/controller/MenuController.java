package com.ds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@RequestMapping(value = "/busan", method = RequestMethod.GET)
	public String busan() throws Exception{
		return "/menu/busanMenu";
	}
	
}
