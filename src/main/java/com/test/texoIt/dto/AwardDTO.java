package com.test.texoIt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AwardDTO {

	private String producer;
	private Integer interval;
	private Integer previousWin;
	private Integer followingWin;
}
