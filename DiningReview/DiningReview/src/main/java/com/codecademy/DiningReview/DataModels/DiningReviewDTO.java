package com.codecademy.DiningReview.DataModels;

import com.codecademy.DiningReview.ReviewScore;

import com.codecademy.DiningReview.Status;
import lombok.Data;

@Data
public class DiningReviewDTO {

	private String reviewerName;
	
	private Long restaurantId;
	
	private ReviewScore peanutAllergyScore;
	
	private ReviewScore eggAllergyScore;
	
	private ReviewScore dairyAllergyScore;
	
	private String commentary;
}
