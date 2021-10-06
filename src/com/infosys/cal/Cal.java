package com.infosys.cal;

public class Cal {

	public int add(int a,int b) {
		
return a+b;

	}
	
	public static void main(String[] args) {
		int  cal=new Cal().add(2,3);
		System.out.println(cal);
	}
}
