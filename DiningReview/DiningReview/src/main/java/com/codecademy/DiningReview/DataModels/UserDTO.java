/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview.DataModels;

import lombok.Data;

@Data
public class UserDTO {

	private String displayName;
	
	private UserAddress userAddress;
	
	private boolean interestPeanutAllergies;
	
	private boolean interestEggAllergies;
	
	private boolean interestDiaryAllergies;
}