package Harjutused;

public class harjutus10 {
	
	public static void main (String [] args) {
		for(int number = 1; number <= 66; number++) { //arvude lugemine 66-ni
			if(number % 5 == 0 && number > 0) //arvude jaotamine 5 kaupa ridadesse
				System.out.println(number); //arvude v�ljastus
			else
				System.out.print(number + " "); //arvude v�ljastus
		}
		
		}
	}

