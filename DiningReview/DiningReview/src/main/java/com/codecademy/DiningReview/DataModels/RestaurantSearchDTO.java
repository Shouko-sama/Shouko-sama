/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview.DataModels;

import java.util.Optional;

import lombok.Data;

@Data
public class RestaurantSearchDTO {
	
	private Long id;
	
	private Long reviewId;
	
	private Optional<String> zipCode;

}