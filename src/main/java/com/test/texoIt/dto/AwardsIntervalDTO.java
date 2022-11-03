package com.test.texoIt.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AwardsIntervalDTO {

	private List<AwardDTO> min;
	private List<AwardDTO> max;
}
