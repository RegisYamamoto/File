package com.regis;

import java.io.File;
import java.io.FileWriter;

public class EscritorDeArquivos {

	public static void main(String[] args) {

		try {
			File file = new File("arquivo.csv");
			FileWriter fileWriter = new FileWriter(file, true);
			
			fileWriter.write("counteudo");
				
			fileWriter.close();
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}

	}

}
