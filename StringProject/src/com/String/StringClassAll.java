package com.String;

import java.util.stream.IntStream;

public class StringClassAll {

	public static void main(String[] args) {
		System.out.println("String class");
		
		//at 2 character the output is r
		String strName = "BankOfAmerica";
		
		char at = strName.charAt(2);
		System.out.println(at);
		
		//Int Stream is deprecated i think
		IntStream chars = strName.chars();
		System.out.println(chars);
		
		//commits not visible in github desktop
		
		System.out.println("Dummy");
		
		int compareTo = strName.compareTo("Chase");
		System.out.println(compareTo);

	}

}
