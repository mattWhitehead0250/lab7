import java.util.PriorityQueue;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType> {
	
	Queue<PatientType> queue = new PriorityQueue<PatientType>();
	
	public QueueHospital() {
		
	}
	
	public void addPatient(PatientType patient) {
		queue.add(patient);
	}
	
	public PatientType nextPatient() {
		return queue.peek();
	}
	
	public PatientType treatNextPatient() {
		return queue.poll();
	}
	
	public int numPatients() {
		return queue.size();
	}
	
	public String hospitalType() {
		return "QueueHospital";
	}
	
	public String allPatientInfo() {
		return queue.toString();
	}
}
