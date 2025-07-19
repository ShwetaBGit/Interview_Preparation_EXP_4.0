package com.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.dto.CommonDto;
import com.sb.entity.Company;
import com.sb.h2.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository companyRepo;
	
	
	public Company saveCompany(CommonDto dto) {
		Company company = new Company(null,dto.getName());
		return companyRepo.save(company);
	}
	
	
	
}
