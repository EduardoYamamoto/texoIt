package com.test.texoIt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MovieDTO {

	private Integer year;
	private String title;
	private String studios;
	private String producers;
	private Boolean winner;
}
