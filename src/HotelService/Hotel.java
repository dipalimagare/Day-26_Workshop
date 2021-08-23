
package HotelService;
import java.time.DayOfWeek;
import HotelReservationCLI.*;

public class Hotel {
	public String Name;

	public int Rating;

	public int WeekdayRate;

	public int WeekendRate;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public int getWeekdayRate() {
		return WeekdayRate;
	}

	public void setWeekdayRate(int weekdayRate) {
		WeekdayRate = weekdayRate;
	}

	public int getWeekendRate() {
		return WeekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		WeekendRate = weekendRate;
	}

	public Hotel(String Name, int Rating, int WeekdayRate, int WeekendRate) {
		this.Name = Name;
		this.Rating = Rating;
		this.WeekdayRate = WeekdayRate;
		this.WeekendRate = WeekendRate;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");

		Hotel lakewood = new Hotel();
		lakewood.setName("Lakewood");
		lakewood.setRating(110);
		System.out.println("Hotel Name is" + lakewood.getName());
		System.out.println("Rate for Regular customer is : " + lakewood.getRating());

		Hotel bridgewood = new Hotel();
		bridgewood.setName("Bridgewood");
		bridgewood.setRating(160);
		System.out.println("Hotel Name is" + bridgewood.getName());
		System.out.println("Rate for Regular customer is :" + bridgewood.getRating());

		Hotel ridgewood = new Hotel();
		ridgewood.setName("Bridgewood");
		ridgewood.setRating(220);
		System.out.println("Hotel Name is" + ridgewood.getName());
		System.out.println("Rate for Regular customer is : " + ridgewood.getRating());
	}
	
	}

	