import java.util.LinkedList;

public class StackHospital<PatientType> extends Hospital<PatientType>{
	
	private LinkedList list = new LinkedList<>();
	
	StackHospital() {};
	
	public void addPatient(PatientType patient) {
		list.add(patient);
	}
	
	public PatientType nextPatient() {
		return (PatientType) list.get(list.size()-1);
	}
	
	public PatientType treatNextPatient() {
		PatientType treated = (PatientType) list.getLast();
		list.removeLast();
		return treated;
	}

	public int numPatients() {
		return list.size();
	}

	public String hospitalType() {
		return "StackHospital";
	}

	public String allPatientInfo() {
		String str = "";
		for (int index = 0; index <list.size()-1; ++index) {
			str += list.get(index).toString();
		}
		return str;
	}
	
}
