import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>{

	Stack<PatientType> stack = new Stack<PatientType>();
	
	public StackHospital() {
		
	}
	
	public void addPatient(PatientType patient) {
		stack.push(patient);
	}
	
	public PatientType nextPatient() {
		return stack.peek();
	}
	
	public PatientType treatNextPatient() {
		return stack.pop();
	}
	
	public int numPatients() {
		return stack.size();
	}
	
	public String hospitalType() {
		return "StackHospital";
	}
	
	public String allPatientInfo() {
		return stack.toString();
	}
}
