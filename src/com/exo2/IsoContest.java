package com.exo2;

import java.util.Arrays;
import java.util.Scanner;

public class IsoContest {

	public static void main(String[] args) {
		String  line;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        line = sc.nextLine();
        int count=0;
        int total_user=n;

		while(sc.hasNextLine() && n>0) {
		line = sc.nextLine();
        Creneau creneau =convertToMinute(line);
         
        if(creneau.heure <8 || creneau.heure >=20) {
              count++;
            }
        
         n--;   
		}
		int cal=total_user/2;
		
		if(count > cal){
		    System.out.println ("SUSPICIOUS");
		    return ;
		}
		
	    System.out.println ("OK");

	}
	
		public static class  Creneau{
		
		int heure;
		int minute;
		
			public Creneau(int heure, int minute) {
			this.heure = heure;
			this.minute = minute;
		}
		
	}
	
		static Creneau convertToMinute(String line) {
		int[] tabsInt=Arrays.stream(line.split(":")).mapToInt(Integer::parseInt).toArray();
		return new Creneau(tabsInt[0],tabsInt[1]);
	}

}
