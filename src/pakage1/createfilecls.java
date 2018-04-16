package pakage1;
import java.io.PrintWriter;

import java.io.File;
import java.io.IOException;

public class createfilecls {
	public static void main(String[] args) 
	{
		try
		{
			File file = new File ("file.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}    
			PrintWriter printWriter = new PrintWriter ("file.txt");
			printWriter.println ("hello");
		    printWriter.close ();       
		  
		}
		catch(IOException e)
		{
			System.out.println("IO exception :"+ e );
		}
		System.out.println("main ends");
	}

}


