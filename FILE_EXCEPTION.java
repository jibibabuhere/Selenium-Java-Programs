package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FILE_EXCEPTION {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		File myObj = new File("SEPTEMBER//MARCH.txt");
		 if(myObj.createNewFile()) {
			 System.out.println("File created:" + myObj.getName());
		 }
		 else {
			 System.out.println("File already exixt");
			 
		 }
		 
		 FileWriter myWriter = new FileWriter("SEPTEMBER//MARCH.txt");// ton write the file
		 myWriter.write("Techmind is a institute");
		 myWriter.close();
		 Thread.sleep(1000);
		 System.out.println("end was the pgm");
	}

}
