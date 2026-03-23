package com.day1.normal;

public class FirstFile {
	

	public int add(int a, int b)
	{
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		
		FirstFile f1 = new FirstFile();
		int i = f1.add(10, 20);
		System.out.println("Addition is:"+i);
		
		System.out.println("This line for the second commit...!");
		
		System.out.println("This line for the third commit form the eclipse...!");
		
	}
}
