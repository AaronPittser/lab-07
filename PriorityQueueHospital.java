import java.util.Collections;
import java.util.LinkedList;

public class PriorityQueueHospital<PatientType> extends QueueHospital<PatientType> implements Comparable<PatientType>{
	
	private LinkedList list = new LinkedList<>();
	
	PriorityQueueHospital() {};
	
	public void addPatient(PatientType patient) {
		list.add(patient);
		Collections.sort(list);
	}
	
	public PatientType nextPatient() {
		Collections.sort(list);
		return (PatientType) list.get(0);
	}
	
	public PatientType treatNextPatient() {
		Collections.sort(list);
		PatientType treated = (PatientType) list.getFirst();
		list.removeFirst();
		return treated;
	}

	public int numPatients() {
		return list.size();
	}

	public String hospitalType() {
		return "PriorityQueueHospital";
	}

	public String allPatientInfo() {
		Collections.sort(list);
		String str = "";
		for (int index = 0; index <list.size()-1; ++index) {
			str += list.get(index).toString();
		}
		return str;
	}

	@Override
	public int compareTo(PatientType arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
