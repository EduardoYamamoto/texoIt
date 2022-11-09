package com.test.texoIt.dto;

public class AwardDTO {

	private String producer;
	
	private Integer interval;
	
	private Integer previousWin;
	
	private Integer followingWin;
	
	
	public AwardDTO(MovieDTO previousMovie, MovieDTO followingMovie) {
		super();
		this.producer = followingMovie.getProducers();
		this.interval = followingMovie.getMovieyear() - previousMovie.getMovieyear();
		this.previousWin = previousMovie.getMovieyear();
		this.followingWin = followingMovie.getMovieyear();
	}

	public String getProducer() {
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public Integer getInterval() {
		return interval;
	}
	
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	
	public Integer getPreviousWin() {
		return previousWin;
	}
	
	public void setPreviousWin(Integer previousWin) {
		this.previousWin = previousWin;
	}
	
	public Integer getFollowingWin() {
		return followingWin;
	}
	
	public void setFollowingWin(Integer followingWin) {
		this.followingWin = followingWin;
	}
}
