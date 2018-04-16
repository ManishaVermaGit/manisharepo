package pakage1;

public class DefaultConsCls {
	
		int id;
		String name;
		

 public void M1() {
	 System.out.println(id+" "+name );
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConsCls obj1 = new DefaultConsCls();
		DefaultConsCls obj2= new DefaultConsCls();
		obj1.M1();
		obj2.M1();
		
	}

}
