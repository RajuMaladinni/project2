package construcoroverloading;

public class Employee {
	int empid;
	String empname;
	
		public Employee (int i) {
			empid=i;
		}
		public Employee (int i, String name) {
			empid=i;
			empname=name;
		}
		public void show() {
			System.out.println(empid+" "+empname);
		}

	public static void main(String[] args) {
		Employee r=new Employee(2);
		r.show();
		Employee r1=new Employee(6);
		r1.show();
		
		
	}

}
