
import java.time.LocalDate;

public abstract class Student implements IStudent {
	protected int no;
	protected String name;
	protected int year;
	protected LocalDate dob;
	protected String major;
	protected String minor;

	public Student(int no, String name, int year, LocalDate dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	@Override
	public void register() {

	}

	@Override
	public String toString() {

		return null;
	}

	@Override
	public int hashCode() {
		int no = this.no;

		return no;
	}
}
