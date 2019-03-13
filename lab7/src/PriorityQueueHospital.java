import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType> {

		PriorityQueue<PatientType> priorQueue = new PriorityQueue<PatientType>();
		
		public PriorityQueueHospital() {
			
		}
		
		public void addPatient(PatientType patient) {
			priorQueue.add(patient);
		}
		
		/**
		 * @return patient at top of priority queue
		 */
		
		public PatientType nextPatient() {
			return priorQueue.peek();
		}
		
		/**
		 * @return Patient removed from priority queue
		 */
		
		public PatientType treatNextPatient() {
			return priorQueue.poll();
		}
		
		/**
		 * @return Total number of patients
		 */
		
		public int numPatients() {
			return priorQueue.size();
		}
		
		/**
		 * @return name of class 
		 */
		
		public String hospitalType() {
			return "PriorityQueueHospital";
		}
		
		/**
		 * @return patient information from priority queue
		 */
		
		public String allPatientInfo() {
			return priorQueue.toString();
		}
}
