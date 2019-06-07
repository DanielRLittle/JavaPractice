package com.qa.arrays;

import java.util.*;

public class Intro {
	public static void main(String[] args) {
		int[][] x = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		ArrayList<String> sList = new ArrayList<String> ();
		sList.add("cheese");
		sList.add("trams");
		sList.add("dogs");
		sList.add("golfer");
		sList.add("fiddle");
		
//		for(int i = 0; i < sList.size(); i++) {
//			if (i == 1) {
//				sList.remove(i);
//			}
//				System.out.println(sList.get(i));
//	}
		System.out.println(x[0][1]);

}
}
