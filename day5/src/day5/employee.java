package day5;

class employee {
	int id;
	String name;
	float salary;
	employee(){
		System.out.println("user defined no argument" + "constructor executed");
	}
	void display() {
		System.out.println(id+ " "+ name +" " + salary);
	}
}

