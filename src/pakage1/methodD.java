package pakage1;

public class methodD {
	int memberVar;
	
	public void submethod() {
		System.out.println(memberVar);		
	}
	
	public void submethod2() {
		char ch='a';
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodD obj=new methodD();
		obj.submethod();
		obj.memberVar = 11;
		obj.submethod();
		obj.memberVar = 22;
		obj.submethod2();
		obj.submethod();

	}

}
