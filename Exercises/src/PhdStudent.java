
import java.time.LocalDate;

public class PhdStudent extends GraduateStudent {
	private boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, LocalDate dob, String major) {
		super(no, name, year, dob, major);
	}

	public PhdStudent(int no, String name, int year, LocalDate dob, String major, boolean qualifyingExamTaken) {
		super(no, name, year, dob, major);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void register() {
		System.out.println("Student number " + this.no + " has been registered.");
	}

	@Override
	public String toString() {

		return "Name: " + this.name + "\nBirthday: " + this.dob + "\nMajor: " + this.major
				+ " \nTaken the qualifying exam? : " + this.qualifyingExamTaken;
	}

	@Override
	public int hashCode() {
		int no = this.no;
		return no;
	}
}
