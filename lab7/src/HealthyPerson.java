
public class HealthyPerson extends Person{

	private String reason;
	
	/**
	 * @param name
	 * @param age
	 * @param reason
	 */
	
	public HealthyPerson(String name, int age, String reason) {
		super(name,age);
		this.reason = reason;
	}
	
	/**
	 * @return sorts patients based on name comparisons
	 */
	
	protected int compareToImpl(Person p) {
		if(this.getName().compareToIgnoreCase(p.getName()) < 0) {
			return -1;
		} else if(this.getName().compareToIgnoreCase(p.getName()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * @return toString about patient
	 */
	
	public String toString() {
		return String.format("%s In for %s", getName().toString(), reason);
	}
}
