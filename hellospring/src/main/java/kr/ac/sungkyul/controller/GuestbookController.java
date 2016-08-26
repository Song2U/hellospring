package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 메서드 단독 매핑
@Controller
public class GuestbookController {
	@RequestMapping("/guestbook/list")
	@ResponseBody
	public String list() {
		return "GuestbookController:list()";
	}
	@ResponseBody
	@RequestMapping("/guestbook/deleteform")
	public String deleteForm(@RequestParam(value = "no", required = false, defaultValue = "-1") Long no) {
		System.out.println("no:" + no);
		return "GuestbookController:deleteform()";
	}
}