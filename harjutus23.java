package Harjutused;

import java.util.Scanner;

public class harjutus23 {

	public static void main(String[] args) {
		 System.out.println ("Teretulemast t�ringu m�ngu!");
	        
		   //T�ringu veeretamine.
		    	
		    		int taring1, taring2;
		    		int rollcount;
		    		rollcount = 0;
					
				do {
					taring1 = (int)(Math.random()*6) + 1;
		            taring2 = (int)(Math.random()*6) + 1;
		            rollcount++;
				}	while ( taring1 != taring2 );{
							System.out.println("Kas soovite veel veeretada? 1 = Jah, 2 = Ei");
							Scanner keyboard = new Scanner(System.in);
							int userinput=keyboard.nextInt();
								}
												
				System.out.println("Te v�itsite " + rollcount + " veeretusega.");
				
			}
		}
	


