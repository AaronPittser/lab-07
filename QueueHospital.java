import java.util.LinkedList;

public class QueueHospital<PatientType> extends Hospital<PatientType> {
	
	private LinkedList list = new LinkedList<>();
	
	QueueHospital() {};
	
	public void addPatient(PatientType patient) {
		list.add(patient);
	}
	
	public PatientType nextPatient() {
		return (PatientType) list.get(0);
	}
	
	public PatientType treatNextPatient() {
		PatientType treated = (PatientType) list.getFirst();
		list.removeFirst();
		return treated;
	}

	public int numPatients() {
		return list.size();
	}

	public String hospitalType() {
		return "QueueHospital";
	}

	public String allPatientInfo() {
		String str = "";
		for (int index = 0; index <list.size()-1; ++index) {
			str += list.get(index).toString();
		}
		return str;
	}
	
}
