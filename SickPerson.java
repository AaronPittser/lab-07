
public class SickPerson extends Person{
	
	// instance variable declaration
	private String name;
	private int age, severity;
	
	// created constructor
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}
	
	// compares this to a Person object
	protected int compareToImpl(Person o) {
		return compareToImpl(o);
	}
	
	// toString()
	public String toString() {
		return super.toString() + " Severity level " + severity;
	}
}
