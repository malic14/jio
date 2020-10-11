package ru.jio.task4;

//ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами
//дробную и целую части числа и вывести полученное значение числа.

public class Revert {

	public static void main(String[] args) throws Exception {
		String s = args[0];
		String s2 = s.substring(4, 7);
		String s1 = s.substring(0, 3);
		s = s2+"."+s1;
		double num = Double.parseDouble(s);
		System.out.println(num);		
	}

}
