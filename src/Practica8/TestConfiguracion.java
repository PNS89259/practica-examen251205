package Practica8;

import java.util.Scanner;

public class TestConfiguracion {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe algo, por favor");
	String algo = sc.nextLine();

	int variableInutil = 10;

	if (algo.equals("Hola")) {
	    System.out.println("Adiós");
	}
    }
}
