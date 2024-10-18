/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.Restaurant;

/**
 *
 * @author mbosupi
 */
public class RestaurantAddress {
    
}
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class RestaurantAddress {
	
	@Column(name = "zip_code")
	private String zipCode;
	
	@Column(name = "name")
	private String name;
}