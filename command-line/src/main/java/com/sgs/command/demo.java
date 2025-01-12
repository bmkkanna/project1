package com.sgs.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
		
		ProcessBuilder processBuilder = new ProcessBuilder();
		if(isWindows) {
			//processBuilder.command(System.getProperty("user.dir") + "\\src\\main\\resources\\input.bat");
			processBuilder.command(System.getProperty("user.home") + "\\Desktop\\input.bat");
		}else {
			processBuilder.command("sh","-c",System.getProperty("user.dir") + "\\src\\main\\resources\\test.sh");
		}
		
		try {
			Process process = processBuilder.start();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			int exitcode = process.waitFor();
			System.out.println("Exit code: "+exitcode);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
