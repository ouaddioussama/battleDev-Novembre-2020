package com.exo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IsoContest {

	public static void main(String[] args) {
		
		String  line;
		Scanner sc = new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		
		int n = sc.nextInt();
		
        line = sc.nextLine();
		
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			int size=line.length();
			if(isNumeric(line.substring(size-5))){
			    list.add(line);
			}
			
		}
		System.out.println(list.size());

	}
	
	public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}

}
