package construcoroverloading;

 class Pen {
	 String color;
	 String type;
	 
	
	 public void printColor() {
		 System.out.println(this.color);
		 System.out.println(this.type);
	 }
	 
	public static void main(String[] args) {
		Pen r=new Pen();
		r.color="blue";
		r.type="Gel";
		r.printColor();
		
		Pen r1=new Pen();
		r1.color="black";
		r1.type="Ball";
		r1.printColor();
	
	}

}
