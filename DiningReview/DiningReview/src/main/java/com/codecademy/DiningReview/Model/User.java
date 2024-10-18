/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name ="USERS")
public class User {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "display_name", unique = true)
	private String displayName;
	
	@Embedded
	private UserAddress userAddress;
	
	@Column(name = "interest_peanut_allergy")
	private boolean interestPeanutAllergies;
	
	@Column(name = "interest_egg_allergy")
	private boolean interestEggAllergies;
	
	@Column(name = "interest_diary_allergy")
	private boolean interestDiaryAllergies;
}