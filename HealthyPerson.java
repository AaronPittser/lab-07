
public class HealthyPerson extends Person{
	
	// declare instance variables
	private String name, reason;
	private int age;
	
	// created constructor
	public HealthyPerson (String name, int age, String reason) {
		super(name, age); // extended Person class does the work
		this.reason = reason;
	}
	
	// compares this object to a Person object
	protected int compareToImpl(Person o) {
		return compareToImpl(o);
	}
	
	// toString()
	public String toString() {
		return super.toString() + " In for " + reason;
	}
}
