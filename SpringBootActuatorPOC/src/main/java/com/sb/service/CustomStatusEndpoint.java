package com.sb.service;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customStatus")
public class CustomStatusEndpoint {

	@ReadOperation
	public String customMsg() {
		return "Service is Up and Running from Custom Status";
	}
}
