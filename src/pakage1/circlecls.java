package pakage1;

public class circlecls extends Shape{
 double radius;
 
 public circlecls(String color,double radius) {
	 super(color);
	 System.out.println("circle cons called");
	 this .radius= radius;
 }

double area() {
	return Math.PI*Math.pow(radius, 2);
}
public String toString() {
    return "Circle color is " + super.color + 
                   " and area is : " + area();

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Shape s1 = new circlecls("Red", 2.2);

System.out.println(s1.toString());
	}

}
