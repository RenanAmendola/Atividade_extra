import java.util.Scanner;

public class Atividade_EX_1 {
	
	

	public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);	
		
	int ano,mes,dia,resultado;
				
		
		System.out.println("Coloque sua idade em anos, meses e dias");
		
		System.out.print("anos: ");
		ano = leia.nextInt();
		
		System.out.print("meses: ");
		mes = leia.nextInt();
		
		System.out.print("dias: ");
		dia = leia.nextInt();
		
		
		
		resultado = (ano * 365) + (mes * 30) + dia;
		
		
		
		
	System.out.println("Você possui "+resultado+" dias de vida");
		
		
		
	}

}
