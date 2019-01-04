package demo;

public abstract class Abstractclassconcept {

	int id;
	String name;

	Abstractclassconcept(int id, String name) {
		id = this.id;
		name = this.name;
		System.out.println("abstract class contructor");

	}
  public void employee(){
	  
	  System.out.println("inside employee method");
	  
  }
	public String employeedetails(){
		return id+name;
}
	
	
}