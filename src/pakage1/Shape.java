package pakage1;

public abstract class Shape {
	String color;
	
	abstract double area();
	public abstract String toString();
	
	public Shape(String color ) {
		System.out.println("shape  cons called");
		this.color= color;
	
	}
	

}
