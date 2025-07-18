package com.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.dto.CommonDto;
import com.sb.entity.Company;
import com.sb.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@PostMapping("/save")
	public Company saveCompnay(@RequestBody CommonDto dto) {
		return companyService.saveCompany(dto);
	}
	
	
}

