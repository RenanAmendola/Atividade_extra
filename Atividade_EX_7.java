import java.util.Scanner;

public class Atividade_EX_7 {
		
	
	public static void main(String[] args) {
		

Scanner leia = new Scanner(System.in);	
	
	
int a,b,c,d,e,f,x,y;
	
	
	System.out.println("Insira os numeros para obter o resultado");
	
	System.out.print("primeiro: ");
	a = leia.nextInt();
	System.out.print("Segundo: ");
	b = leia.nextInt();
	System.out.print("Terceiro: ");
	c = leia.nextInt();
	System.out.print("Quarto: ");
	d = leia.nextInt();
	System.out.print("Quinto: ");
	e = leia.nextInt();
	System.out.print("Sexto: ");
	f = leia.nextInt();
	
	
x = (c*e - b*f)/(a*e - b*d);
	
y = (a*f - c*d)/(a*e - b*d);	
	
	
System.out.println("O resultado de x foi: "+x);	
System.out.println("O resultado de y foi: "+y);		
	}
}
