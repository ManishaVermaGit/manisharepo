package pakage1;

public class returnclsrevise { 
 
	public String method1 (String name) {
		 String  product2 = "lovely";
		 String productfullname = name +product2;
		 return productfullname;
	}

	
	public void method2 () {
		String productfullname=method1("fairand");
	System.out.println(productfullname);	
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
returnclsrevise obj=new returnclsrevise();
obj.method2();
	}

}
