import java.util.Scanner;

public class Atividade_EX_4 {
	
	

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);			
		
		
int a,b,c,d,r,s;	
		
		
	System.out.println("Coloque 3 numeros");
		
	
	System.out.print("Primeiro numero: ");
	a = leia.nextInt();
		
		
	System.out.print("Segundo numero: ");
	b = leia.nextInt();	

	System.out.print("Terceiro numero: ");
	c = leia.nextInt();
	
	
	
	
	r = (int) Math.pow((a+b),2);
	
	s = (int) Math.pow((c+b),2);
	
	
	d = (r+s)/2;
	
	
	System.out.println("o resultado de D é: "+d);
	
	
	
	}
		
}