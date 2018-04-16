package pakage1;

public class PrePostCls {
	public void preMethod(int x) {
		System.out.println(x);
	}

	public void postMethod(int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int preVR = 10;
		PrePostCls obj = new PrePostCls();
		obj.preMethod(++preVR);
		System.out.println(preVR++);
		
		
	}

}
