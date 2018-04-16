package pakage1;

public class conspoly {
	conspoly(String name){
		System.out.println("constructor with argument string name "+ name);
		
	}
	conspoly (String name,int age){
		System.out.println("cons with id:"+ name+ " age:"+ age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conspoly c=new conspoly("ganesh");
		conspoly c1= new conspoly("guju",25);
	}

}
