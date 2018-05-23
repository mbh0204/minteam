package com.ds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public void test1() throws Exception {
		
	}
}
