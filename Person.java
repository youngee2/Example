package D22;

class Person {
	String name,school;
	int grade;
	

	public Person(String name, String school, int grade) {
		this.name=name;
		this.school=school;
		this.grade=grade;
	}
	
	void print() {
		System.out.println("Name : "+name);
		System.out.println("School : "+school);
		System.out.println("Grade : "+grade);
	}
}