import org.junit.Assert;
import org.junit.Test;

public class PersonAndHospitalsTests {
	
	@Test
	public void addPatientTest() {
		StackHospital<Animal> animal = new StackHospital<Animal>();
		animal.addPatient((new Animal("Dog", 5)));
		animal.addPatient(new Animal("Moose", 22));
		String actual = animal.toString();
		String expected = "A StackHospital-type hospital with 2 patients.";
		Assert.assertEquals(expected, actual);

		
		StackHospital<Person> person = new StackHospital<Person>();
		person.addPatient((new SickPerson("Donald", 10, 8)));
		actual = person.toString();
		expected = "A StackHospital-type hospital with 1 patients.";
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> person2 = new QueueHospital<Person>();
		person2.addPatient((new SickPerson("Donald", 10, 8)));
		actual = person2.toString();
		expected = "A QueueHospital-type hospital with 1 patients.";
		Assert.assertEquals(expected,  actual);
		
		PriorityQueueHospital<Person> person3 = new PriorityQueueHospital<Person>();
		person3.addPatient((new SickPerson("Donald", 10, 8)));
		actual = person3.toString();
		expected = "A PriorityQueueHospital-type hospital with 1 patients.";
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void nextPatientTest() {
		StackHospital<Animal> animal = new StackHospital<Animal>();
		animal.addPatient((new Animal("Dog", 5)));
		animal.addPatient(new Animal("Moose", 22));
		String actual = animal.nextPatient().toString();
		String expected = "A 22-year old Moose.";
		Assert.assertEquals(expected, actual);
		
		StackHospital<Person> person = new StackHospital<Person>();
		person.addPatient((new SickPerson("Donald", 10, 8)));
		person.addPatient((new SickPerson("David", 20, 5)));
		actual = person.nextPatient().toString();
		expected = "David severity level 5";
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> person2 = new QueueHospital<Person>();
		person2.addPatient((new SickPerson("Donald", 10, 8)));
		person2.addPatient((new SickPerson("David", 20, 5)));
		actual = person.nextPatient().toString();
		expected = "David Severity level 5";
		Assert.assertEquals(expected, actual);
		

		PriorityQueueHospital<Person> person3 = new PriorityQueueHospital<Person>();
		person3.addPatient((new HealthyPerson("Donald", 10, "Cough")));
		person3.addPatient(new HealthyPerson("David", 20, "Fever"));
		actual = person3.nextPatient().toString();
		expected = "David In for Fever";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void treatNextPatientTest() {
		StackHospital<Animal> animal = new StackHospital<Animal>();
		animal.addPatient((new Animal("Dog", 5)));
		animal.addPatient(new Animal("Moose", 22));
		String actual = animal.treatNextPatient().toString();
		String expected = "A 22-year old Moose.";
		Assert.assertEquals(expected, actual);
		
		StackHospital<Person> person = new StackHospital<Person>();
		person.addPatient((new SickPerson("Donald", 10, 8)));
		person.addPatient(new SickPerson("David", 20, 5));
		actual = person.treatNextPatient().toString();
		expected = "David Severity level 5";
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> person2 = new QueueHospital<Person>();
		person2.addPatient((new SickPerson("Donald", 10, 8)));
		person2.addPatient(new SickPerson("David", 20, 5));
		actual = person2.treatNextPatient().toString();
		expected = "David Severity level 5";
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> person3 = new PriorityQueueHospital<Person>();
		person3.addPatient((new HealthyPerson("Donald", 10, "Cough")));
		person3.addPatient(new HealthyPerson("David", 20, "Fever"));
		actual = person3.treatNextPatient().toString();
		expected = "Donald In for Cough";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void numPatientsTest() {
		StackHospital<Animal> animal = new StackHospital<Animal>();
		animal.addPatient(new Animal("Dog", 5));
		animal.addPatient(new Animal("Moose", 22));
		int actual = animal.numPatients();
		int expected = 2;
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> person = new QueueHospital<Person>();
		person.addPatient((new SickPerson("Donald", 10, 8)));
		person.addPatient(new SickPerson("David", 20, 5));
		actual = person.numPatients();
		expected = 2;
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> person2 = new PriorityQueueHospital<Person>();
		person2.addPatient((new HealthyPerson("Donald", 10, "Cough")));
		person2.addPatient(new HealthyPerson("David", 20, "Fever"));
		actual = person2.numPatients();
		expected = 2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void hospitalTypeTest() {
		StackHospital<Animal> animal = new StackHospital<Animal>();
		String actual = animal.hospitalType();
		String expected = "StackHospital";
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> person = new QueueHospital<Person>();
		actual = person.hospitalType();
	    expected = "QueueHospital";
		Assert.assertEquals(expected, actual);
		
		PriorityQueueHospital<Person> person2 = new PriorityQueueHospital<Person>();
		actual = person2.hospitalType();
	    expected = "PriorityQueueHospital";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void allPatientInfoTest() {
		StackHospital<Animal> animal = new StackHospital<Animal>();
		animal.addPatient(new Animal("Dog", 5));
		animal.addPatient(new Animal("Moose", 22));
		String actual = animal.allPatientInfo();
		String expected = "[A 5-year old Dog., A 22-year old Moose.]";
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> person = new QueueHospital<Person>();
		person.addPatient((new SickPerson("Donald", 10, 8)));
		person.addPatient(new SickPerson("David", 20, 5));
		actual = person.allPatientInfo();
		expected = "[David Severity level 5, Donald Severity level 8]";
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> person2 = new PriorityQueueHospital<Person>();
		person2.addPatient((new HealthyPerson("Donald", 10, "Cough")));
		person2.addPatient(new HealthyPerson("David", 20, "Fever"));
		actual = person2.allPatientInfo();
		expected = "[Donald In for Cough, David In for Fever]";
		Assert.assertEquals(expected, actual);
	}
	
	public void compareToImplTest() {
		Person sick = new SickPerson("Donald", 10, 8);
		Person sick2 = new SickPerson("David", 20, 5);
		int actual1 = sick.compareTo(sick2);
		int expected1 = 1;
		Assert.assertEquals(expected1, actual1);
		
		actual1 = sick2.compareTo(sick);
		expected1 = -1;
		Assert.assertEquals(expected1, actual1);
		
		
		Person healthy = new HealthyPerson("Mike", 15, "Cough");
		Person healthyTwo = new HealthyPerson("Larry", 25, "Fever");
		int actual2 = healthy.compareTo(healthyTwo);
		int expected2 = -1;
		Assert.assertEquals(expected2,actual2);
	}
	
	@Test
	public void toStringTest() {
		Person sickPerson = new SickPerson("Donald", 10, 8);
		String actual = sickPerson.toString();
		String expected = "Donald Severity level 8";
		Assert.assertEquals(expected, actual);
		
		Person healthyPerson = new HealthyPerson("David", 22, "Cough");
		actual = healthyPerson.toString();
		expected = "David In for Cough";
		Assert.assertEquals(expected, actual);
	}
}
