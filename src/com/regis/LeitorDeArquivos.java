package com.regis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeitorDeArquivos {

	public static void main(String[] args) {

		try {
			File file = new File("arquivo.csv");
			FileReader fileReader = new FileReader(file);
			// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.csv"), "UTF-8")); // Utilizar esta implementação caso tenha acentuação no arquivo

			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			System.out.println(bufferedReader.readLine());

			bufferedReader.close();
			bufferedReader.close();

		} catch (Exception e) {

		}

	}

}
