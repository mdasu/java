package org.training.movies;

public class Movies {
//name, rating, year, time
	public String movieName;
	public String rating;
	public int yearReleased;
	public int runTime;

	public Movies(String movieName, String rating, int yearReleased, int runTime) {
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.yearReleased = yearReleased;
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", rating=" + rating + ", yearReleased=" + yearReleased + ", runTime="
				+ runTime + "]";
	}
	
}
