package cpm.lld.bms;
public class CinemaHall {

	int cinemaHallId;
	String cinemaHallName;

	Address address;

	List<Audi>audiList;

	public Map<Date, Movies> getMovies(List<Date> dateList);
	public Map<Date, Show> getShows(List<Date> dateList);

}

