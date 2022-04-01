import java.util.Scanner;

public class Atividade_EX_2 {
	
	

	public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);	
		
	int ano,mes,dia;
				
		
		System.out.println("Coloque sua idade em dias");
		
		System.out.print("dias: ");
		dia = leia.nextInt();
		
		
		
		ano = dia/365;
		mes = (dia%365)/30;
		dia = (dia%365)%30;
		
		
		
		
	System.out.println("Você possui "+ano+" anos, " +mes+" meses e "+dia+ " dias de vida");
		
		
		
	}

}
