/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codecademy.DiningReview;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;



@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, String> {

	@Override
	public String convertToDatabaseColumn(Status status) {
		if (status == null) {
			return null;
		}
		return status.getCode();
	}

	@Override
	public Status convertToEntityAttribute(String code) {
		if (code == null) {
			return null;
		}

		return Stream.of(Status.values()).filter(s -> s.getCode().equals(code)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

}