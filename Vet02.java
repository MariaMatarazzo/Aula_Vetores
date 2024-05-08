package Aula_08_05;

import java.util.Scanner;

public class Vet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int [5];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.print("informe um valor: " + i + "..:");
			a [i]= ler.nextInt ();
		}
		
		for (int i =0; i<5; i++) {
			System.out.println(a[i]);
			
		}
		ler.close();

	}

}
