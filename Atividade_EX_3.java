import java.util.Scanner;

public class Atividade_EX_3 {
	
	

	public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);	
		

	int seg, min, hora;



	System.out.println("Escreva a sua carga horaria em segundos");
	
	seg = leia.nextInt();
	
	hora = (seg/60)/60;
	min = (seg/60)%60;
	seg = (seg%60)%60;
		
	
	
	
	System.out.println("A carga horaria é de "+hora+" horas, "+min+" minutos e "+seg+" segundos");
	
	
	
	
	}

}
