
import java.time.LocalDate;

public class GraduateStudent extends Student {
	protected String advisor;
	protected String thesis;

	public GraduateStudent(int no, String name, int year, LocalDate dob, String major) {
		super(no, name, year, dob, major);
	}

	public GraduateStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}

	@Override
	public void register() {
	}

	public void writeThesis() {
		System.out.println("Thesis has been written. " + thesis);
	}

	public void meetWithAdvisor() {
		System.out.println("The advisor is waiting for the meeting. Contact: " + advisor);
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
