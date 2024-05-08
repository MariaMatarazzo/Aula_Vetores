package Aula_08_05;

import java.util.Scanner;

public class NomeVet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a[] = new String [5];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.print("informe O nome: " + i + "..:");
			a [i]= ler.next ();
		}
		
		for (int i =0; i<5; i++) {
			System.out.println(a[i]);
			
		}
		ler.close();

	}




	}


