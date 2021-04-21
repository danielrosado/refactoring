package usantatecla.movies.v25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

	@Test
	public void withoutRentalsTest() {
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName)
				.totalAmount(0).frequentRenterPoints(0).build();
		assertEquals(result, statement);
	}

	@Test
	public void regularRental1DayTestCharge() {
		double expected = 2;
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void regularRental1DayTestFrequentPoints() {
		int expected = 1;
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void regularRental1DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 2)
				.totalAmount(2).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}


	@Test
	public void regularRental2DayTestCharge() {
		double expected = 2;
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void regularRental2DayTestFrequentPoints() {
		int expected = 1;
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void regularRental2DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 2)
				.totalAmount(2).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}

	@Test
	public void regularRental3DayTestCharge() {
		double expected = 3.5;
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void regularRental3DayTestFrequentPoints() {
		int expected = 1;
		Movie movie = new MovieBuilder().title("movieName").regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}
	@Test
	public void regularRental3DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).regular().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 3.5)
				.totalAmount(3.5).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}

	@Test
	public void newReleaseRental1DayTestCharge() {
		double expected = 3;
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void newReleaseRental1DayTestFrequentPoints() {
		int expected = 1;
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void newReleaseRental1DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 3)
				.totalAmount(3).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}


	@Test
	public void newReleaseRental2DayTestCharge() {
		double expected = 3;
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void newReleaseRental2DayTestFrequentPoints() {
		int expected = 2;
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void newReleaseRental2DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(2).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 3)
				.totalAmount(3).frequentRenterPoints(2).build();
		assertEquals(result, statement);
	}


	@Test
	public void newReleaseRental3DayTestCharge() {
		double expected = 3;
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void newReleaseRental3DayTestFrequentPoints() {
		int expected = 2;
		Movie movie = new MovieBuilder().title("movieName").newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void newReleaseRental3DayTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).newRelease().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 3)
				.totalAmount(3).frequentRenterPoints(2).build();
		assertEquals(result, statement);
	}


	@Test
	public void childrenRental1DayTestCharge() {
		double expected = 1.5;
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void childrenRental1DayTestFrequentPoints() {
		int expected = 1;
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void childrenRental1DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(1).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 1.5)
				.totalAmount(1.5).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}


	@Test
	public void childrenRental3DayTestCharge() {
		double expected = 1.5;
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void childrenRental3DayTestFrequentPoints() {
		int expected = 1;
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void childrenRental3DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(3).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 1.5)
				.totalAmount(1.5).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}

	@Test
	public void childrenRental4DayTestCharge() {
		double expected = 6;
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		double result = rental.getCharge();
		assertEquals(expected, result, 0);
	}

	@Test
	public void childrenRental4DayTestFrequentPoints() {
		int expected = 1;
		Movie movie = new MovieBuilder().title("movieName").childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		int result = rental.getFrequentRenterPoints();
		assertEquals(expected, result);
	}

	@Test
	public void childrenRental4DayFormatTest() {
		String movieName = "movieName";
		Movie movie = new MovieBuilder().title(movieName).childrens().build();
		Rental rental = new RentalBuilder().movie(movie).daysRented(4).build();
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName).rental(rental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName).movie(movieName, 6)
				.totalAmount(6).frequentRenterPoints(1).build();
		assertEquals(result, statement);
	}

	@Test
	public void rentalTest() {
		String regularMovieName = "regularMovieName";
		Movie regularMovie = new MovieBuilder().title(regularMovieName).regular().build();
		Rental regularRental = new RentalBuilder().movie(regularMovie).daysRented(10).build();

		String newReleaseMovieName = "newReleaseMovieName";
		Movie newReleaseMovie = new MovieBuilder().title(newReleaseMovieName).newRelease().build();
		Rental newReleaseRental = new RentalBuilder().movie(newReleaseMovie).daysRented(10).build();
		
		String childrensMovieName = "childrensMovieName";
		Movie childrensMovie = new MovieBuilder().title(childrensMovieName).childrens().build();
		Rental childrensRental = new RentalBuilder().movie(childrensMovie).daysRented(10).build();
		
		String customerName = "customerName";
		Customer customer = new CustomerBuilder().name(customerName)
				.rental(regularRental).rental(newReleaseRental).rental(childrensRental).build();

		String statement = customer.statement();

		String result = new StatementBuilder().customerName(customerName)
				.movie(regularMovieName, 14).movie(newReleaseMovieName, 3).movie(childrensMovieName, 15)
				.totalAmount(32).frequentRenterPoints(4).build();
		assertEquals(result, statement);
	}
	
	
}
