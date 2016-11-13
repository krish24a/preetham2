package com.arrays;

public class Arrays {

	public static void main(String[] args) {
		Integer[] intArr={1,2,3,4,5};
		String[] strArr = {"one","two","three","four"};
		Arrays a=new Arrays();
		a.printArray(intArr);
		a.printArray(strArr);
	}
	
	public void printArray(Integer[] intArr){
		
		for(Integer i : intArr){
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public void printArray(String[] strArr){
		
		for(String i : strArr){
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
