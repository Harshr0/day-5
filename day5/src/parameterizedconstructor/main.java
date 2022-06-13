package parameterizedconstructor;

import parameterizedconstructor.employee;
public class main {

	public static void main(String[] args) {
		employee e1 = new employee(101, "Harsh", 45000);
		employee e2 = new employee(102, "Harh", 25000);
		employee e3 = new employee(103, "Har", 35000);
		e1.display();
		e2.display();
		e3.display();

	}

}
