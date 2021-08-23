
package HotelService;
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
}