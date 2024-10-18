/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import lombok.Data;

@Data
@Embeddable
public class UserAddress {
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "zip_code")
	private String zipCode;
}
