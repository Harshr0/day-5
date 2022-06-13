package parameterizedconstructor;

class employee {
	int id;
	String name;
	float salary;
	employee(int id, String name, float salary){
		System.out.println("user defined no argument" + "constructor executed");
	}
	void display() {
		System.out.println(id+ " "+ name +" " + salary);
	}

}
