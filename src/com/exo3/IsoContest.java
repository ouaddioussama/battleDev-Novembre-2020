package com.exo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IsoContest {

	public static void main(String[] args) {

		// Declaration des Variable
		Map<String, List<String>> mapPereFils = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		String line="";
		int n = sc.nextInt();
		sc.nextLine();// Sauter la ligne

		while (sc.hasNextLine() && n > 0 ) {

			line = sc.nextLine();
			String[] inputs = line.split(" ");

			String fils = inputs[0];
			String pere = inputs[1];

			// traitement d'initialisation
			if (mapPereFils.containsKey(pere)) {
				mapPereFils.get(pere).add(fils);
			} else {
				mapPereFils.put(pere, new ArrayList<>(Arrays.asList(fils)));
			}

			n--;
		}
		
		sc.close();
		// jusqu'à ici , on a rempli les données d'entrées
		//////////////////// traitement principale ///////////////////

		List<String> level = new ArrayList<String>(Arrays.asList("0"));
		int[] level_count = new int[10];
		List<String> new_level = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			level_count[i] = level.size();
			new_level.clear();
			
			for (String agent : level) {
				if (mapPereFils.containsKey(agent)) {
					new_level.addAll(mapPereFils.get(agent));
				}
			}
			level.clear();
			level.addAll(new_level);

		}

		// print Result
		Arrays.stream(level_count).forEach(x -> System.out.print(x + " "));
		

	}

}
