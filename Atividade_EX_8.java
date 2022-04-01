import java.util.Scanner;

public class Atividade_EX_8 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);			
		
double CustFab,PorcDist = 1.28,Impost = 1.45;
		
	System.out.println("Escreva o valor bruto");	
		
	CustFab = leia.nextDouble();
	
	CustFab = (CustFab * PorcDist) * Impost;
		
	System.out.println("O custo final do carro foi de: "+CustFab);	

	}

}
