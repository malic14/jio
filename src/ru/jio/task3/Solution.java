package ru.jio.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// sin x +cos x
// ------------- * tg xy
// cos x - cos y

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//make reader from console
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//input fist number
		System.out.println("x");
		double x = Double.parseDouble(reader.readLine());
		//input second number
		System.out.println("y");
		double y = Double.parseDouble(reader.readLine());
		//calculate expression
		double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y); 
		//output solution
		System.out.println(z);
		reader.close();
				
	}

}
