/*
 * @author Matt Whitehead
 */
public class HealthyPerson extends Person {
	
	private String reasonForVisit;

/**
	 * @param reasonForVisit : Why a healthy person is visiting a hospital
	 * @param age : What's their age (years)
	 * @param name : What's their name
	 * 
	 */

	public HealthyPerson(String name, int age, String reason) {
		super(name,age);
		this.reasonForVisit = reason;
	}
	/*
	 * @param otherPerson : Who healthyperson is being compared against
	 * @return - returns variance based on value returned from comparison. If otherPerson is not HealthyPerson, returns 0. If value is less than zero (Healthy comes before other) returns 1. Greater than zero (both are the same)
	 */
	
	@Override
	public int compareTo (Person otherPerson) {
		if (this.getName().compareTo(otherPerson.getName()) < 0) {
			return 1;
		} else if (this.getName().compareTo(otherPerson.getName()) > 0) {
			return 11;
		} else {
			return 0;
		}
	}
	
	/*
	 * @return - Returns the formatted to string
	 */
	
	@Override
	public String toString() {
		return String.format("%s In for %s", this.getName(), this.reasonForVisit);
	}
}
