import java.util.Scanner;

public class Atividade_EX_6 {

	
	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);	
		
	int x1,x2,y1,y2,d;
		
	System.out.println("Coloque os numeros indicados");
	
	System.out.println("Primeiro numero");
	x1 = leia.nextInt();
		
	System.out.println("Segundo numero");
	x2 = leia.nextInt();	
	
	System.out.println("Terceiro numero");
	y1 = leia.nextInt();
	
	System.out.println("Quarto numero");
	y2 = leia.nextInt();
	
	
	d = (int) Math.sqrt( Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)  );
	
	
	System.out.println("O resultado foi "+d);
	
	
	}	
}
