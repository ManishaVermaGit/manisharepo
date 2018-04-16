package pakage1;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		 for (i=1; i<=5; i++) {
			 
			 for (int j=1; j<=(5 -i +1);  j++) {
				 System.out.print(j);
				 System.out.print(" ");
			 }
			 //System.out.println("outerloop i="+i);
			 System.out.println();
		 }
		 

	}

}
