package com.vstl.constructjava;

public class Constructors {
	
	//Default constructors
	public Constructors() {
		System.out.println("Medical Name is AnirudhaMedical");
	}
	
	//single parameter constructor
	public Constructors(String strMedicalBranch) {
		System.out.println("Medical Branch:"+strMedicalBranch);
	}
	
	//two parameter constructors
	public Constructors(String strOwnarName,String strphoneNumber) {
		System.out.println("Medical Branch::"+strOwnarName+" "+strphoneNumber);
	}

	}
