package com.test.texoIt.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class MovieDTO {

	@Id
	@Column
	private int movieid;
	
	@Column
	private int movieyear;
	
	@Column
	private String title;
	
	@Column
	private String studios;
	
	@Column
	private String producers;
	
	@Column
	private String winner;
	
	
	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public int getMovieyear() {
		return movieyear;
	}

	public void setMovieyear(int movieyear) {
		this.movieyear = movieyear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStudios() {
		return studios;
	}

	public void setStudios(String studios) {
		this.studios = studios;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public boolean isWinner() {
		return winner!=null && winner.equalsIgnoreCase("yes");
	}
	
	public String getProducers() {
		return producers;
	}

	public void setProducers(String producers) {
		this.producers = producers;
	}

}
