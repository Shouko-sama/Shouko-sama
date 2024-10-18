/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ReviewScoreConverter implements AttributeConverter<ReviewScore, String> {

	@Override
	public String convertToDatabaseColumn(ReviewScore rvwScore) {
		if (rvwScore == null) {
			return null;
		}
		return rvwScore.getScore();
	}

	@Override
	public ReviewScore convertToEntityAttribute(String score) {
		if (score == null) {
			return null;
		}

		return Stream.of(ReviewScore.values()).filter(s -> s.getScore().equals(score)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}