package cpm.lld.bms;

import java.util.List;

public class BMSService  {

	List<CinemaHall> cinemas;

	public List<Movie> getMovies(Date date, String city);
	public List<CinemaHall> getCinemalHalls(String city);

}

