package usantatecla.movies.v22;

public class RentalBuilder {

	private usantatecla.movies.v22.Movie movie;
	private int daysRented;
	
	public RentalBuilder movie(Movie movie) {
		this.movie = movie;
		return this;
	}
	
	public RentalBuilder daysRented(int daysRented) {
		this.daysRented = daysRented;
		return this;
	}
	
	public usantatecla.movies.v22.Rental build() {
		return new Rental(movie, daysRented);
	}
	
	
}
