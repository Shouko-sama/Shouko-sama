/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview.ExceptionHandlers;

import org.springframework.http.HttpStatus;

public class NotFoundException  extends RuntimeException{

	public NotFoundException(String message) {
		super(message);
	}
	
	public HttpStatus getStatus() {
		return HttpStatus.NOT_FOUND;
	}
}