package ru.jio.task2;

import java.io.*;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException{
		//make reader from console
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//input fist number
		System.out.println("a");
		double a = Double.parseDouble(reader.readLine());
		//input second number
		System.out.println("b");
		double b = Double.parseDouble(reader.readLine());
		//input third number
		System.out.println("c");
		double c = Double.parseDouble(reader.readLine());
		//calculate expression
		double z = (b + Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2); 
		//output solution
		System.out.println(z);
		reader.close();
	}

}
