package cpm.lld.bms;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Movie {

	String movieName;
	int movieId;
	int durationInMins;
	String language;
	Genre genre;
	Date releaseDate;
	Map<String, List<Show>> cityShowMap;

}

