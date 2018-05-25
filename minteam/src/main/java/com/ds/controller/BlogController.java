package com.ds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/blog/*")
public class BlogController {

	@RequestMapping(value = "/blogMain", method = RequestMethod.GET)
	public String blogMain() throws Exception {
		return "blog/blogMain";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post() throws Exception {
		return "blog/post";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() throws Exception {
		return "blog/writeForm";
	}
}
