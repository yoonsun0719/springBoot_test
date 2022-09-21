package com.test.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
//	@RequestMapping(value = "/")
//	public String home() {
//		return "index.html";
//	}
	
	@GetMapping("test")
	public String test() {
		return "test";
	}
	
	@PostMapping("test2")
	public Map test2(@RequestBody Map param) {
		System.out.println("post 컨트롤러");
		System.out.println(param);
		// id, pwd 데이터베이스에서 검색한 후 결과 값 지정
		Map result = new HashMap();
		// 맞는 id, pwd 일때
//		result.put("result", 1);
		
		// 아닐때
		result.put("result", 2);
		result.put("data", "user정보");
		return result;
	}
}
