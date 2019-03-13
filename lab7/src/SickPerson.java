
public class SickPerson extends Person{

	private int severity;
	
	/**
	 * @param name
	 * @param age
	 * @param severity
	 */
	
	public SickPerson(String name, int age, int severity) {
		super(name,age);
		this.severity=severity;
	}
	
	/**
	 * @return sorts patients
	 */
	
	protected int compareToImpl(Person p) {
		if(this.severity > ((SickPerson) p).severity) {
			return -1;
		} else if(this.severity < ((SickPerson) p).severity) {
			return 1;
		} else {
			return 0;
		}
	}
	/**
	*@return toString with information about patient
	*/
	
	public String toString() {
		return String.format("%s Severity level %d", getName().toString(), this.severity);
	}
}
