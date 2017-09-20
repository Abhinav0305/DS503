package main;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import entities.MyPage;
import java.io.*;


public class DataOperator {

	public int intgenerator(int min, int max) {

		Random random = new Random();
		int answer = random.nextInt(max - min + 1) + min;
		return answer;

	}

	public String sgenerator(int min, int max) {

		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int randlength = intgenerator(min, max);
		for (int i = 0; i < randlength - 1; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		return output;
	}

	public void output(ArrayList<?> listPage, String dir) {

		try {

			File tmpDir = new File(dir);
			boolean exists = tmpDir.exists();
			System.out.println(exists);
			FileWriter fw = null;
			if(exists){
				fw = new FileWriter(dir, true);

			}
			else{
				fw = new FileWriter(dir);

			}

			for (Object element : listPage) {
				String oneline = element.toString();
				fw.append(oneline);
			}
			fw.flush();
			fw.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


}