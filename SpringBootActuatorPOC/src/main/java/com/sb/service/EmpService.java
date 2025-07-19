package com.sb.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.dto.CommonDto;
import com.sb.entity.EmpEntity;
import com.sb.mysql.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepo;

	public EmpEntity saveEmp(CommonDto empDto) {
		EmpEntity emp = new EmpEntity();
		emp.setEname(empDto.getName());
		emp.setDepartment(empDto.getDepartment());
		emp.setDesignation(empDto.getDesignation());
		emp.setExperience(empDto.getExperience());
		emp.setDoj(Instant.now());
		return empRepo.save(emp);
	}

	public List<EmpEntity> getAll() {
		return empRepo.findAll();
	}

}
