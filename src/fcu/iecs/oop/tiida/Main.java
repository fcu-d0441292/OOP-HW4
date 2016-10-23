package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		NissanTiida a=new NissanTiida();
		Scanner x=new Scanner(System.in);
		int b;
		System.out.println("Please enter a number:");
		b=x.nextInt();
		a.NissanTiida(b);
	}

}
