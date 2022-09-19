package construcoroverloading;

 class Student {
	String name;
	//String City;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printinfo(int age) {
	System.out.println(age);
	}
	
	public void printinfo(int age, String name) {
		System.out.println(age+" "+name);

	}
	
//	Student(String name, int age){
//		this.name=name;
//		this.age=age;
//		//System.out.println("constructor called");
//	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Raj";
		s1.age=26;
		s1.printInfo(s1.name);
		s1.printinfo(s1.age);
		s1.printinfo(s1.age,s1.name);
		

	}

}
