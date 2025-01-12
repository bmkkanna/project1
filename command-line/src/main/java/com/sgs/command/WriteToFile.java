package com.sgs.command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\u734049\\Desktop\\output1.xml");
		
		String str = "Hai";
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			 writer.write(str);
			 writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    
	    
	}
}
