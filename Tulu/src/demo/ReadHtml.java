package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class ReadHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	try {
			BufferedReader br=new BufferedReader(new FileReader(new File("Z:\\GA-Work\\reports.html")));
			String line=null;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//String temp=generateRandom("ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789");
		//givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect();
		//givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect();
		//System.out.println(temp);
		generateFriendsDataSet();
		//generateRandomNos();
       
	}
	private static String generateRandom(String aToZ) {
	    Random rand=new Random();
	    StringBuilder res=new StringBuilder();
	    for (int i = 0; i < 17; i++) {
	       int randIndex=rand.nextInt(aToZ.length()); 
	       res.append(aToZ.charAt(randIndex));            
	    }
	    return res.toString();
	}
	public static void givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect() {
		  
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    	for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    String generatedString = buffer.toString();
		    System.out.println(generatedString);
	   
	}
	public static void givenUsingApache_whenGeneratingRandomStringBounded_thenCorrect() {
		
		
		String pwd=System.getProperty("user.dir");
		try {
			PrintWriter pr=new PrintWriter(new FileWriter(new File(pwd+File.separator+"MyPage.csv")));
			int length = 10;
		    boolean useLetters = true;
		    boolean useNumbers = false;
		    Random random=new Random();
		    for(int i=1;i<=100000;i++){
		    	@SuppressWarnings("deprecation")
				String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		    	String name=RandomStringUtils.random(length, useLetters, useNumbers);
		    	int randomNum = random.nextInt(10)+1;
		    	String hobby=RandomStringUtils.random(20, useLetters, useNumbers);
		    	//System.out.println(i+","+generatedString+","+name+","+ countryCode+","+hobby+","+randomNum);
		    	pr.println(i+","+generatedString+","+name+","+randomNum+","+hobby);
		    	pr.flush();
		    }
		    pr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void generateFriendsDataSet(){
		String pwd=System.getProperty("user.dir");
		int length = 20;
	    boolean useLetters = true;
	    boolean useNumbers = false;
		try{
			PrintWriter pr=new PrintWriter(new FileWriter(new File(pwd+File.separator+"FriendsDataSet.csv")));
			for(int i=1;i<=2000000;i++){
				if(length==50){
					length=20;
				}
				String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				pr.println(i+","+generateRandomNos(1,100000)+","+generateRandomNos(1,100000)+","+generateRandomNos(1,1000000)+","+generatedString);
				pr.flush();
				length++;
	
			}
			pr.close();
		}catch(IOException e){
			
		}	
	}
	public static int generateRandomNos(int min,int max){
		if(min>=max){
			
		}
		Random r=new Random();
		return r.nextInt((max-min)+1)+min;
	}
}
