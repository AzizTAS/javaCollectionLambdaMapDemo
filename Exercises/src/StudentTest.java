
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import java.util.function.Supplier;

public class StudentTest {

	public static void main(String[] args) {

		RegistrationOffice register = new RegistrationOffice();
		Supplier<Student> supplyStudent = () -> register.getAStudent();
		Student s = supplyStudent.get();

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s);

		Map<Integer, Student> mapping = new HashMap<Integer, Student>();
		for (Student students : studentList) {
			mapping.put(students.no, students);
		}

		for (Map.Entry<Integer, Student> entry : mapping.entrySet()) {
			if (entry.getValue() instanceof Student) {
				System.out.println("Student no: " + entry.getKey() + "\nStudent informations:\n" + entry.getValue()
						+ "\nStudent type: " + s.getClass().getName());

			}
		}
	}
}
