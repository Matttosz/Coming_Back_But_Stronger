package aula03;

import java.util.Scanner;

public class zoologico {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("*****************************");
        System.out.println("* Bem-Vindo ao Zoológico MM *");
		System.out.println("*****************************");
		System.out.println("* Defina o animal Desejado  *");
		System.out.println("*                           *");
		System.out.println("*        Vertebrado         *");
		System.out.println("*       Invertebrado        *");
		System.out.println("*****************************");
		System.out.print  ("*Responda Aqui:");
		String Vertebra = read.next();
		
		if
			(Vertebra.equalsIgnoreCase("vertebrado")) 
		{
			System.out.println("*****************************");
			System.out.println("*     Se trata de um(a)?    *");
			System.out.println("*                           *");
			System.out.println("*           Ave             *");
			System.out.println("*         Mamífero          *");
			System.out.println("*****************************");
			System.out.print  ("*Responda Aqui:");
			String AvesMamiferos = read.next(); 
			
			if 
				(AvesMamiferos.equalsIgnoreCase("Ave"))
			{
				System.out.println("*****************************");
				System.out.println("*        O animal é ?       *");
				System.out.println("*                           *");
				System.out.println("*        Carnívoro          *");
				System.out.println("*         Onívoro           *");
				System.out.println("*****************************");
				System.out.print  ("*Responda Aqui:");
				String CarnivoroOnivoro = read.next();
				
				if 
					(CarnivoroOnivoro.equalsIgnoreCase("Carnivoro")) 
				{
					System.out.println("*********************************");
					System.out.println("* Seu Animal se trata de uma... *");
					System.out.println("**         Águia               **");
				    System.out.println("*********************************");
				    System.out.println("*         Acertei ?             *");
				    System.out.println("*********************************");
			
		        }
				else if
						(CarnivoroOnivoro.equalsIgnoreCase("Onivoro")) 
				{
						System.out.println("*********************************");
						System.out.println("* Seu Animal se trata de uma... *");
						System.out.println("**         Pomba               **");
					    System.out.println("*********************************");
					    System.out.println("*         Acertei ?             *");
					    System.out.println("*********************************");
		
				}else {
					System.out.println("*****************************");
					System.out.println("*     Inserção Inválida     *");
					System.out.println("*****************************");
				      }
			
			}
			  
			else if 
				(AvesMamiferos.equalsIgnoreCase("Mamifero"))
			{
			     System.out.println("*****************************");
			     System.out.println("*        O animal é ?       *");
				 System.out.println("*                           *");
				 System.out.println("*        Herbivoro          *");
				 System.out.println("*         Onívoro           *");
				 System.out.println("*****************************");
				 System.out.print  ("*Responda Aqui:");
				 String HerbivoroOnivoro = read.next();
					
					   if 
							(HerbivoroOnivoro.equalsIgnoreCase("Herbivoro")) 
					   {
						   System.out.println("*********************************");
						   System.out.println("* Seu Animal se trata de uma... *");
						   System.out.println("**          Vaca               **");
						   System.out.println("*********************************");
						   System.out.println("*         Acertei ?             *");
						   System.out.println("*********************************");
				
					   }
					  
					   else if
							(HerbivoroOnivoro.equalsIgnoreCase("Onivoro")) 
					   {
							System.out.println("*********************************");
							System.out.println("* Seu Animal se trata de um...  *");
							System.out.println("**         Humano              **");
						    System.out.println("*********************************");
						    System.out.println("*         Acertei ?             *");
						    System.out.println("*********************************");
			
						}else {
							System.out.println("*****************************");
							System.out.println("*     Inserção Inválida     *");
							System.out.println("*****************************");
							  }
		   
				}
	    }
			
		
		
			
		
		else if
		    (Vertebra.equalsIgnoreCase("Invertebrado")) 
	    { 
			System.out.println("*****************************");
		    System.out.println("*     Se trata de um?    *");
		    System.out.println("*                           *");
		    System.out.println("*          Inseto           *");
		    System.out.println("*         Anelideo          *");
		    System.out.println("*****************************");
		    System.out.print  ("*Responda Aqui:");
		    String InsetoAnelideo = read.next(); 
		
		    if 
			   (InsetoAnelideo.equalsIgnoreCase("Inseto"))
		    {
			    System.out.println("*****************************");
			    System.out.println("*        O animal é ?       *");
			    System.out.println("*                           *");
			    System.out.println("*        Hematofago         *");
			    System.out.println("*         Herbivoro         *");
			    System.out.println("*****************************");
			    System.out.print  ("*Responda Aqui:");
			    String HematoAnelideo = read.next();
			
			    if 
					(HematoAnelideo.equalsIgnoreCase("hematofago")) 
			    {
			    	System.out.println("*********************************");
			    	System.out.println("* Seu Animal se trata de uma... *");
			    	System.out.println("**         Pulga               **");
			    	System.out.println("*********************************");
			    	System.out.println("*         Acertei ?             *");
			    	System.out.println("*********************************");
		
			    }
			    else if
					(HematoAnelideo.equalsIgnoreCase("Lagarta")) 
			    {
					System.out.println("*********************************");
					System.out.println("* Seu Animal se trata de uma... *");
					System.out.println("**         Lagarta              **");
				    System.out.println("*********************************");
				    System.out.println("*         Acertei ?             *");
				    System.out.println("*********************************");
	
			    }else { 
					System.out.println("*****************************");
					System.out.println("*     Inserção Inválida     *");
					System.out.println("*****************************");
			    	  }	
		
		    }
		  
		else if 
			(InsetoAnelideo.equalsIgnoreCase("Anelideo"))
		{
		     System.out.println("*****************************");
		     System.out.println("*        O animal é ?       *");
			 System.out.println("*                           *");
			 System.out.println("*        Hematofago         *");
			 System.out.println("*         Onívoro           *");
			 System.out.println("*****************************");
			 System.out.print  ("*Responda Aqui:");
			 String HematoOnivoro = read.next();
				
				   if 
						(HematoOnivoro.equalsIgnoreCase("Hematofago")) 
				   {
					   System.out.println("*********************************");
					   System.out.println("* Seu Animal se trata de uma... *");
					   System.out.println("**       Sanguessuga           **");
					   System.out.println("*********************************");
					   System.out.println("*         Acertei ?             *");
					   System.out.println("*********************************");
			
				   }
				  
				   else if
						(HematoOnivoro.equalsIgnoreCase("Onivoro")) 
				   {
						System.out.println("*********************************");
						System.out.println("* Seu Animal se trata de um...  *");
						System.out.println("**         Minhoca             **");
					    System.out.println("*********************************");
					    System.out.println("*         Acertei ?             *");
					    System.out.println("*********************************");
		
					}else {
						System.out.println("*****************************");
						System.out.println("*     Inserção Inválida     *");
						System.out.println("*****************************");
					      }	
			}
		
        }   else{ 
        	System.out.println("*****************************");
        	System.out.println("*     Inserção Inválida     *");
        	System.out.println("*****************************");	
				}
			
	}
}


