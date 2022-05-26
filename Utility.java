package com.vstl.loops.constructor;

import java.util.Random;

public class Utility {
	
	
	public static String getRandomName() {
		
		String strRandomName="";
		String strArray[]= {"Aditi","Priyanka","Ekta","Aditi","Priti","jyoti","Rahul","rakesh","Pradip"};
		strRandomName=  ("Facebook Name:"+strArray[new Random().nextInt(strArray.length)]);	
	 return strRandomName;
	}
	
	
	public static String getRandomLastName() {
		String strRandomLastName="";
		String strArray[]= {"teli","patil","patane","Modi","vibhute","Maratha","Ganger","khandekar","khanapure"};
		strRandomLastName=("Facebook last Name:"+strArray[new Random().nextInt(strArray.length)]);
		return strRandomLastName;
	}
	
	public static String getMobileNumber() {
		Random rd=new Random();
		String strMobileNumber="";
		
		int intMobileNo;
		String str[]=new String [10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}
    return  strMobileNumber = str[0]+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9];
    
		}

	public static String getGender() {
		String strGender;
		if(Math.random() > 0.5) strGender  = "MALE";
		else strGender = "FEMALE";
		return strGender=("gender: "+strGender);
	
	}
}
