
import java.time.LocalDate;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);

	}

	@Override
	public void register() {
		System.out.println("Student number " + no + " has been registered.");
	}

	@Override
	public String toString() {

		return "Name: " + this.name + "\nBirthday: " + this.dob + "\nMajor: " + this.major + "\nAdvisor: "
				+ this.advisor + "\nThesis subject: " + this.thesis;
	}

	@Override
	public int hashCode() {
		int no = this.no;
		return no;
	}
}
