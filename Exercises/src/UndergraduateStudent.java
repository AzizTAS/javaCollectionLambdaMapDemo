
import java.time.LocalDate;

public class UndergraduateStudent extends Student {
	private String minor;

	public UndergraduateStudent(int no, String name, int year, LocalDate dob, String minor) {
		super(no, name, year, dob, minor);
		this.minor = minor;
	}

	@Override
	public void register() {
		System.out.println("Student number " + no + " has been registered.");
	}

	@Override
	public String toString() {

		return "Name: " + this.name + "\nBirthday: " + this.dob + "\nMinor: " + this.minor;
	}

	@Override
	public int hashCode() {
		int no = this.no;

		return no;
	}

}
