package com.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sb.dto.CommonDto;
import com.sb.entity.EmpEntity;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {

	private static final String BASE_URL = "http://localhost:8080/";

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/save")
	public EmpEntity saveCompnay(@RequestBody CommonDto dto) {
		ResponseEntity<EmpEntity> postForEntity = restTemplate.postForEntity(BASE_URL + "emp/save", dto, EmpEntity.class);
		return postForEntity.getBody();
	}
	
	@GetMapping("/getAllEmp")
	public List<EmpEntity> getAllEMP(){ResponseEntity<List<EmpEntity>> response = restTemplate.exchange(
	        BASE_URL + "emp/fetchAllEmp",
	        HttpMethod.GET,
	        null,
	        new ParameterizedTypeReference<List<EmpEntity>>() {}
	    );
	    return response.getBody();
}

}
