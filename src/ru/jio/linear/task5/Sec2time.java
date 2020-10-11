package ru.jio.linear.task5;


// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
// данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

public class Sec2time {

	public static void main(String[] args) {
		int sec = Integer.parseInt(args[0]);
		int hour = sec/(60*60);
		int min = sec/60-hour*60;
		sec = sec-hour*3600-min*60;
		System.out.printf("%dч %dмин %dс",hour,min,sec);
	}

}
