package com.collectionFramework;
import java.io.FileOutputStream;
public class FileIOStream {

	public static void main(String[] args) {
		
   try {
	   FileOutputStream fos=new FileOutputStream ("D:\\javatestinput.txt");
	   String s=" Hi This is Teju Reddy";
			   byte b[]=s.getBytes();
			   fos.write(b);
			   fos.close();
   }
   catch(Exception e) {
	   System.out.println(e);
   }
   System.out.println("Data Inserted");
	}

}
