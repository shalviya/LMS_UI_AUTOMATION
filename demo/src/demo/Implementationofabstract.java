package demo;

public class Implementationofabstract extends Abstractclassconcept {

	Implementationofabstract(int id, String name) {
		super(id, name);
	}

	public String employeedetails() {
		System.out.println("employeedetails");
		return name + id;

	}

}
