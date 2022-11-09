package com.test.texoIt.dto;

import java.util.List;

public class AwardsIntervalDTO {

	private List<AwardDTO> min;
	
	private List<AwardDTO> max;

	
	public AwardsIntervalDTO(List<AwardDTO> min, List<AwardDTO> max) {
		super();
		this.min = min;
		this.max = max;
	}

	public List<AwardDTO> getMin() {
		return min;
	}

	public void setMin(List<AwardDTO> min) {
		this.min = min;
	}

	public List<AwardDTO> getMax() {
		return max;
	}

	public void setMax(List<AwardDTO> max) {
		this.max = max;
	}
	
	
}
