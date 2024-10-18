/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.codecademy.DiningReview;

public enum ReviewScore {
	ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5");

	private String score;
	
	ReviewScore(String score) {
		this.score = score;
	}
	
	public String getScore() {
		return score;
	}
}
