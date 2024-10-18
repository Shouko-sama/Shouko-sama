/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview.DataModels;

import lombok.Data;

@Data
public class RestaurantDTO {

	private RestaurantAddress restaurantAddress;

	private Double peanutAllergyScore;
	
	private Double eggAllergyScore;
	
	private Double dairyAllergyScore;

	private Double overAllRestaurantScore;

}