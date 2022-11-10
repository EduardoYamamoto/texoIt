package com.test.texoIt.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.texoIt.dto.AwardDTO;
import com.test.texoIt.dto.AwardsIntervalDTO;
import com.test.texoIt.dto.MovieDTO;
import com.test.texoIt.repository.MovieRepository;

@Service
public class AwardsIntervalService {

	@Autowired
	MovieRepository movieRepository;

	public AwardsIntervalDTO getAwardsInterval() {
		//generate a map of producers and their awards
		Map<String, List<AwardDTO>> awardsPerProducer = generateParsedMovieList().stream()
				.collect(Collectors.groupingBy(MovieDTO::getProducers, 
					Collectors.collectingAndThen(Collectors.toList(), list -> {
						return getAwardListFromMovies(list);
					})));
		
		//group all awards together
		List<AwardDTO> allAwardsList = new ArrayList<AwardDTO>();
		awardsPerProducer.forEach((key, value) -> allAwardsList.addAll(value));
		
		return new AwardsIntervalDTO(getMin(allAwardsList), getMax(allAwardsList));
	}
	
	private List<MovieDTO> generateParsedMovieList() {
		List<MovieDTO> movieList = new ArrayList<MovieDTO>();
		
		//parse each producer and create a new MovieDTO
		StreamSupport.stream(movieRepository.findAll().spliterator(), false)
				.filter(movie -> movie.isWinner())
				.forEach(movie -> {
					for(String producer : movie.getProducers().split(",| and ")) {
						MovieDTO parsedMovie = new MovieDTO(movie);
						parsedMovie.setProducers(producer.trim());
						movieList.add(parsedMovie);
					}
				});
		return movieList;
	}
	
	private List<AwardDTO> getAwardListFromMovies(List<MovieDTO> movieList) {
		//order movies by year
		List<MovieDTO> orderedMovieList = movieList.stream()
				.sorted(Comparator.comparing(MovieDTO::getMovieyear))
				.collect(Collectors.toList());
		
		//generate awards based on movies
		return IntStream.range(1, orderedMovieList.size()) 
		        .mapToObj(index -> new AwardDTO(orderedMovieList.get(index-1),orderedMovieList.get(index)))
		        .collect(Collectors.toList());
	}
	
	private List<AwardDTO> getMin(List<AwardDTO> allAwardsList) {
		int minInterval = allAwardsList.stream()
				.mapToInt(AwardDTO::getInterval)
				.min().orElse(-1);
		
		//get all awards with min interval
		return allAwardsList.stream()
				.filter(award -> award.getInterval() == minInterval)
				.collect(Collectors.toList());
	}
	
	private List<AwardDTO> getMax(List<AwardDTO> allAwardsList) {
		int maxInterval = allAwardsList.stream()
				.mapToInt(AwardDTO::getInterval)
				.max().orElse(-1);
		
		//get all awards with max interval
		return allAwardsList.stream()
				.filter(award -> award.getInterval() == maxInterval)
				.collect(Collectors.toList());
	}
}
