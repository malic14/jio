package ru.jio.linear.task6;

import java.util.*;

// Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:

// 		  |
//		**|**
//      **|**
//		**|**
// --------------->
//    ****|****
//    ****|****

public class Range {

	public static void main(String[] args) {
		//create shooting range (1000x1000)
		boolean[][] b = new boolean[1000][1000];
		b[498][500] = true;
		b[499][500] = true;
		b[500][500] = true;
		b[501][500] = true;
		b[498][501] = true;
		b[499][501] = true;
		b[500][501] = true;
		b[501][501] = true;
		b[498][502] = true;
		b[499][502] = true;
		b[500][502] = true;
		b[501][502] = true;
		b[498][503] = true;
		b[499][503] = true;
		b[500][503] = true;
		b[501][503] = true;
		b[496][499] = true;
		b[497][499] = true;
		b[498][499] = true;
		b[499][499] = true;
		b[500][499] = true;
		b[501][499] = true;
		b[502][499] = true;
		b[503][499] = true;
		b[496][498] = true;
		b[497][498] = true;
		b[498][498] = true;
		b[499][498] = true;
		b[500][498] = true;
		b[501][498] = true;
		b[502][498] = true;
		b[503][498] = true;
		b[496][497] = true;
		b[497][497] = true;
		b[498][497] = true;
		b[499][497] = true;
		b[500][497] = true;
		b[501][497] = true;
		b[502][497] = true;
		b[503][497] = true;
		//create shoot
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		int x = sc.nextInt()+499;
		System.out.print(">> ");
		int y = sc.nextInt()+499;
		//output result
		System.out.print(b[x][y]);
		sc.close();
	}

}
