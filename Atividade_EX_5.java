import java.util.Scanner;

public class Atividade_EX_5 {

	
	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);

double n1,n2,n3,med;

System.out.println("Insira suas notas");
	
System.out.print("Nota 1: ");
n1 = leia.nextDouble();
	
System.out.print("Nota 2: ");
n2 = leia.nextDouble();
			
System.out.print("Nota 3: ");
n3 = leia.nextDouble();
		
	
	
med =(n1*2 + n2*3 + n3*5)/10;	
	
	
	System.out.println("A sua media foi "+ med );
	
	if(med<=6) {
		System.out.println("Você foi reprovado");
	}else {
		System.out.println("Você foi aprovado");
	}
	
	
	
	
	}	
}
