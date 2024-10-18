/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.codecademy.DiningReview;

public enum Status {
	ACCEPTED("A"), PENDING("P"), REJECTED("R");
	
	private String code;
	
	private Status(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
