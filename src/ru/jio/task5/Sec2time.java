package ru.jio.task5;

public class Sec2time {

	public static void main(String[] args) {
		int sec = Integer.parseInt(args[0]);
		int hour = sec/(60*60);
		int min = sec/60-hour*60;
		sec = sec-hour*3600-min*60;
		System.out.printf("%d÷ %dìèí %dñ",hour,min,sec);
	}

}
