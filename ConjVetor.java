package Aula_08_05;

import java.util.Scanner;

public class ConjVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.print("informe um valor do conjunto A: ");
			a[i]= ler.nextInt ();
			c[i] = a[i]; 
		
		}
		for (int i =0; i<5; i++) {
			System.out.print("informe um valor do conjunto B:  ");
			b [i]= ler.nextInt ();
			c[i+5] = b[i];
		}
		for(int i=0;i<10;i++) {
			System.out.println(c[i]);
	
		}
		
		}

	
		}
	
	
	





