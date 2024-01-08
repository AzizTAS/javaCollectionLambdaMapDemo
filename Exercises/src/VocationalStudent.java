
import java.time.LocalDate;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, LocalDate dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	public void register() {
		System.out.println("Student number " + no + " has been registered.");
	}

	@Override
	public String toString() {

		return "Name: " + this.name + "\nBirthday: " + this.dob + "\nMajor: " + this.major;
	}

	@Override
	public int hashCode() {
		int no = this.no;
		return no;
	}
}
