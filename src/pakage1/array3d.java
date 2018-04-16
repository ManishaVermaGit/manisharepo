package pakage1;

public class array3d {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][][] str={
			
		{ 	{"a","b","c"}, {"d","f","g"}, {"h","i","j"}, {"k","l","m"}  },
		{   {"n","o","p"}, {"q","r","s"}, {"t","u","v"}, {"w","x","y"}  }    
		};
		
		
	for(int i=0; i<2; i++) {
		for(int j=0; j<4; j++) {
		    for(int k=0; k<3; k++) {
		    	System.out.print( str [i][j][k]);
		    	System.out.print(" ");
		    }
		    System.out.println();
		}
		System.out.println();
	 }
		
	
	   }
	                
}
                  