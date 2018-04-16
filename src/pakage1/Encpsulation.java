package pakage1;

public class Encpsulation {

	private int id;
	private String Name;
	private int Age;
	
	public  String getname() {
		return Name;
	}
	
	public int getid() {
		return id;
	}
	public int getage() {
		return Age;
	}
	public void setname (String newname) {
	
		Name=newname;
		//Name="manisha";
	}
	public void setid(int newid) {
		 id= newid;
	//	id=101;
	}
	public void setage(int newage) {
		Age=newage;
		//Age=21;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encpsulation obj =new Encpsulation();
obj.setname("ghgh");
obj.setage(9);
obj.setid(908);


System.out.println("Name: "+obj.getname() +" id:"+obj.getid()+ " Age:"+obj.getage());
	}

}
