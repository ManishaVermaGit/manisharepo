package pakage1;

public class ReturnCls {
	 
	public int Method1(int y) {
		if (y%2==0) {
			return 1;
		}
		else {
			return 11;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iseven;
 ReturnCls obj= new ReturnCls();
 iseven = obj.Method1(21);
 
 
System.out.println(iseven);
	}

}
