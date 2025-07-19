package com.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.dto.CommonDto;
import com.sb.entity.EmpEntity;
import com.sb.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/save")
	public EmpEntity saveEmp(@RequestBody CommonDto empdto) {
		return empService.saveEmp(empdto);
	}

	
	@GetMapping("/fetchAllEmp")
	public List<EmpEntity> getAllEmp() {
		return empService.getAll();
	}

}
