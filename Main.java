import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner name = new Scanner(System.in);
	    Scanner option  = new Scanner(System.in);
	    
	    String nameUser;
	    int op;
	    
	    System.out.println("Qual o seu nome? ");
	    nameUser = name.nextLine();
	    System.out.println("0 - Bom Dia! || 1 - Boa Tarde! || 2 - Boa Noite!");
	    System.out.println("Escolha um cumprimento: ");
	    
	    op = option.nextInt();
	        
	   switch(op){
	       case 0:
	           System.out.println("Olá " + nameUser + ". Bom Dia!");
	           break;
	       case 1:
	           System.out.println("Olá " + nameUser + ". Boa Tarde!");
	           break;
	       case 2:
	           System.out.println("Olá " + nameUser + ". Boa Noite!");
	           break;
	       default:
	        System.out.println("Opcão inválida!");
	       
	   }
	    
	}
}
