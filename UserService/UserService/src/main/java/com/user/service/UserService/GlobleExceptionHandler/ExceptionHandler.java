package com.user.service.UserService.GlobleExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.service.UserService.Exception.ResourceNotFoundException;
import com.user.service.UserService.payloads.ApiResponce;

@RestControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,Object>> handlerResourceNotFoundException(ResourceNotFoundException ex){
	Map map=new HashMap<>();
	map.put("message", ex.getMessage());
	map.put("success",false);
	map.put("status",HttpStatus.NOT_FOUND);
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}

}
