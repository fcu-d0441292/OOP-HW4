package fcu.iecs.oop.tiida;

public class NissanTiida {
	public void NissanTiida(int number){
		int i;
		for(i=0;i<number;i++){
			for(int b=0;b<i+1;b++){
				for(int c=0;c<i+1;c++){
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
