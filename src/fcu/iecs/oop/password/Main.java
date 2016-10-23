package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		PasswordEncorder s=new PasswordEncorder();
		Scanner out=new Scanner(System.in);
		String a;
		while(true){
			System.out.println("Enter a string:");
			a=out.next();
			String exit="exit";
			if(a.equals(exit)){
				return;
			}else{
				s.encode(a);
				System.out.println(s.encode(a));
			}
			
		}
		
	}
	
}
