package pakage1;

public class constructorCls {
	//default constructor
	/*constructorCls(){
		System.out.println("default constructor with no return type");
	}
	*/
	//parameterized
	constructorCls(int id, String name){
		System.out.println(id+" "+name);	
	}

	
	//public void disp(){
	//System.out.println(id+" "+name);	
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorCls obj =new constructorCls(89, "manisha");
		constructorCls obj1 =new constructorCls(90, "anisha");
        //obj.disp();
		//obj.disp1();
}
}