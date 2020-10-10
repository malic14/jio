package ru.jio.task1;

import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException{
		//make reader from console
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//input fist number
		System.out.println("a");
		double a = Double.parseDouble(reader.readLine());
		//input second number
		System.out.println("b");
		double b = Double.parseDouble(reader.readLine());
		//input second number
		System.out.println("c");
		double c = Double.parseDouble(reader.readLine());
		//calculate expression
		double z = ((a-3.0)*b/2.0)+c; 
		//output solution
		System.out.println(z);
		reader.close();
	}

}
