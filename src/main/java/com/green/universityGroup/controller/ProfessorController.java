package com.green.universityGroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@Controller
public class ProfessorController {

	@GetMapping("/professor")
	public String main() {
		return "/views/professor/p-main";
	}
	
	@GetMapping("/board")
	public String board() {
		return "/views/professor/board/board";
	}
	
	
	@GetMapping("/professor/view")
	public String view() {
		return "/views/professor/board/view";
	}
	
	@GetMapping("/professor/write")
	public String write() {
		return "/views/professor/board/write";
	}
	
	@GetMapping("/professor/edit")
	public String edit() {
		return "/views/professor/board/edit";
	}
	
	
	@GetMapping("/mail")
	public String mail() {
		return "/views/professor/mail/mail";
	}
	
	@GetMapping("/professor/mail-view")
	public String mail_view() {
		return "/views/professor/mail/mail-view";
	}
	
	
	@GetMapping("/professor/{no}")
	public String detail(@PathVariable("no") long no) {
		return "/views/professor/detail";
	}
	
	@PutMapping("/professor/{no}")
	public String update(@PathVariable("no") long no) {
		return "redirect:/professor";
	}
}
