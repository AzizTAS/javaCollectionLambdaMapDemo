
import java.time.LocalDate;

public class RegistrationOffice implements IRegister {

	@Override
	public Student getAStudent() {
		LocalDate local = null;
		Student s = null;
		int i = (int) (5 * Math.random());
		Student[] sArray = new Student[5];
		sArray[0] = new GraduateStudent(0, "Aziz Tas", 2015, local.of(1996, 7, 9), "Computer Engineering",
				"Stephan Hawking", "Dark Matter Recipes");
		sArray[1] = new PhdStudent(1, "Ludwig Wittgenstein", 1908, local.of(1889, 4, 26),
				"Tractatus Logico-Philosophicus", true);
		sArray[2] = new UndergraduateStudent(2, "Thomas Edison", 1847, local.of(1847, 2, 11), "Electricity");
		sArray[3] = new VocationalStudent(3, "Stephan Hawking", 1959, local.of(1942, 1, 8), "Cosmology");
		sArray[4] = new MasterStudent(4, "Nikola Tesla", 1875, local.of(1856, 7, 10), "Mathematic-Physic",
				"Micheal Faraday", "Engineering");

		return s = sArray[i];

	}
}
